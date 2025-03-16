/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cxcosmo
 */
import java.awt.event.* ;
import java.io.*;
import java.util.* ;
public class BookIO implements WindowListener{
    private ArrayList<Book> b ;
    private BookController bc ;
    public BookIO(BookController bc){
        this.bc = bc ;
        b = new ArrayList<>() ;
    }
    public void addBook(Book book){
        b.add(book) ;
        bc.getBv().getName().setText(b.getLast().getName());
        bc.getBv().getPrice().setText(Double.toString(b.getLast().getPrice()));
        bc.getBv().getType().setSelectedItem(b.getLast().getType());
        bc.getBv().getNum().setText(Integer.toString(b.size()));
    }
    
    public void updateBook(){
        String name = bc.getBv().getName().getText() ;
        double price = Double.parseDouble(bc.getBv().getPrice().getText()) ;
        String type = (String) bc.getBv().getType().getSelectedItem() ;
        int index = Integer.parseInt(bc.getBv().getNum().getText())  - 1 ;
        b.get(index).setName(name) ;
        b.get(index).setPrice(price) ;
        b.get(index).setType(type) ;
    }
    
    public void deleteBook(){
        int index = Integer.parseInt(bc.getBv().getNum().getText())  - 1 ;
        b.remove(index) ;
        if (b.size() > 0) {
            Book bs = b.get(0) ;
            bc.getBv().getName().setText(bs.getName());
            bc.getBv().getPrice().setText(Double.toString(bs.getPrice()));
            bc.getBv().getType().setSelectedItem(bs.getType());
            bc.getBv().getNum().setText("1");
        } else {
            bc.getBv().getName().setText("");
            bc.getBv().getPrice().setText("");
            bc.getBv().getType().setSelectedItem("General");
            bc.getBv().getNum().setText("0");
        }
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
        try ( ObjectInputStream in_obj = new ObjectInputStream(new FileInputStream("book.dat"))){
            this.b = (ArrayList<Book>) in_obj.readObject() ;
            System.out.println(b.size())  ;
        } catch (IOException ex) {
            System.out.println("Can't Load File!");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class Not Found!");
        }finally{
            bc.getBv().getNum().setText(Integer.toString(b.size())) ;
            if (b.size() != 0){
                Book bo = b.get(0) ;
                bc.getBv().getName().setText(bo.getName()) ;
                bc.getBv().getPrice().setText(Double.toString(bo.getPrice())) ;
                bc.getBv().getType().setSelectedItem(bo.getType());
            }
        }
    }
        
    @Override
    public void windowClosing(WindowEvent e) {
        try (ObjectOutputStream out_obj = new ObjectOutputStream(new FileOutputStream("book.dat"))){
            out_obj.writeObject(this.b) ;
            System.out.println("Save!!");
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}

    public ArrayList<Book> getB() {
        return b;
    }

    public void setB(ArrayList<Book> b) {
        this.b = b;
    }

}

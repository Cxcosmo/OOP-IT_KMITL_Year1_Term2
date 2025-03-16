/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cxcosmo
 */
import java.awt.event.* ;
public class BookAddContro implements ActionListener{
    private BookAdd ba ;
    private BookIO bm ;
    
    public BookAddContro(BookIO bm){
        this.ba = new BookAdd(this) ;
        this.bm = bm ;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ba.getInsert())){
            String name = ba.getName().getText() ;
            double price = Double.parseDouble(ba.getPrice().getText()) ;
            String type = (String) ba.getType().getSelectedItem() ;
            bm.addBook(new Book(name, price, type)) ;
            ba.getFr().dispose();
            new BookPopUp("Done it.","Add Command") ;
        }
    }

    public BookAdd getBa() {
        return ba;
    }

    public void setBa(BookAdd ba) {
        this.ba = ba;
    }

    public BookIO getBm() {
        return bm;
    }

    public void setBm(BookIO bm) {
        this.bm = bm;
    }
    
}

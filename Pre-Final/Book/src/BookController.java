/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cxcosmo
 */
import java.awt.event.* ;
public class BookController implements ActionListener{
    private BookView bv ;
    private BookIO bm ;
    public BookController(BookView bv){
        this.bv = bv ;
        this.bm = new BookIO(this) ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(bv.getLeft())){
            if (Integer.parseInt(bv.getNum().getText()) > 1){
                bv.getNum().setText(Integer.toString(Integer.parseInt(bv.getNum().getText()) - 1));
                int index = Integer.parseInt(bv.getNum().getText())  - 1 ;
                bv.getName().setText(bm.getB().get(index).getName());
                bv.getPrice().setText(Double.toString(bm.getB().get(index).getPrice()));
                bv.getType().setSelectedItem(bm.getB().get(index).getType());
            }
            
        } else if (e.getSource().equals(bv.getRight())){
            if (Integer.parseInt(bv.getNum().getText()) < bm.getB().size()){
                bv.getNum().setText(Integer.toString(Integer.parseInt(bv.getNum().getText()) + 1));
                int index = Integer.parseInt(bv.getNum().getText())  - 1 ;
                bv.getName().setText(bm.getB().get(index).getName());
                bv.getPrice().setText(Double.toString(bm.getB().get(index).getPrice()));
                bv.getType().setSelectedItem(bm.getB().get(index).getType());
            }
        } else if (e.getSource().equals(bv.getAdd())){
            new BookAddContro(this.bm) ;
            
        }else if (e.getSource().equals(bv.getUpdate())){
            if (bm.getB().size() != 0){
                new BookPopUp("Done it.","Update Command") ;
                bm.updateBook() ;
            }else{
                new BookPopUp("Add Some Book First", "Update Command") ;
            }
        }else if (e.getSource().equals(bv.getDelete())){
            if (bm.getB().size() != 0){
                new BookPopUp("Done it.","Update Command") ;
                bm.deleteBook() ;
            }else{
                new BookPopUp("No Book","Delete Command") ;
            }
        }
    }

    public BookView getBv() {
        return bv;
    }

    public void setBv(BookView bv) {
        this.bv = bv;
    }

    public BookIO getBm() {
        return bm;
    }

    public void setBm(BookIO bm) {
        this.bm = bm;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cxcosmo
 */
import java.awt.* ;
import javax.swing.* ;
public class BookAdd {
    private JFrame fr ;
    private JPanel info, botton;
    private JLabel nl, pl, tl;
    private JTextField name, price ;
    private JComboBox type ;
    private JButton insert ;
    private String itemList[] = {"General", "Computer", "Math&Sci", "Photo"} ;
    private BookAddContro bc ;
    
    public BookAdd(BookAddContro bc){
        fr = new JFrame("Book") ;
        info = new JPanel() ;
        botton = new JPanel() ;
        nl = new JLabel("   Name") ;
        pl = new JLabel("   Price") ;
        tl = new JLabel("   Type") ;
        name = new JTextField() ;
        price = new JTextField() ;
        type = new JComboBox(itemList) ;
        insert = new JButton("Insert") ;
        this.bc = bc ;
        
        info.setLayout(new GridLayout(3, 2)) ;
        botton.setLayout(new FlowLayout()) ;
        
        Object oItem[] = {nl, name, pl, price, tl, type} ;
        for (int i = 0; i < oItem.length ; i++){
            info.add((Component) oItem[i]) ;
        }
        botton.add(insert) ;
        fr.add(info, BorderLayout.CENTER) ;
        fr.add(botton, BorderLayout.SOUTH) ;
        insert.addActionListener(bc);
        
        fr.setLocation(260, 0);
        
        fr.setSize(250, 150); ;
        fr.setResizable(false);
        fr.setVisible(true);
    }

    public JTextField getName() {
        return name;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JTextField getPrice() {
        return price;
    }

    public void setPrice(JTextField price) {
        this.price = price;
    }

    public JComboBox getType() {
        return type;
    }

    public void setType(JComboBox type) {
        this.type = type;
    }

    public JButton getInsert() {
        return insert;
    }

    public void setInsert(JButton insert) {
        this.insert = insert;
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }
    
}

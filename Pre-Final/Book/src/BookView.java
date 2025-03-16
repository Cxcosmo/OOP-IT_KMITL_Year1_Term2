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
public class BookView {
    private JFrame fr ;
    private JPanel info, nextback, botton;
    private JLabel nl, pl, tl;
    private JTextField name, price, num ;
    private JComboBox type ;
    private JButton left, right, add, update, delete ;
    private String itemList[] = {"General", "Computer", "Math&Sci", "Photo"} ;
    private BookController bc ;
    
    public BookView() {
        fr = new JFrame("Book") ;
        info = new JPanel() ;
        nextback = new JPanel() ;
        botton = new JPanel() ;
        nl = new JLabel("   Name") ;
        pl = new JLabel("   Price") ;
        tl = new JLabel("   Type") ;
        name = new JTextField() ;
        price = new JTextField() ;
        num = new JTextField() ;
        type = new JComboBox(itemList) ;
        left = new JButton("<<<") ;
        right = new JButton(">>>") ;
        add = new JButton("Add") ;
        update = new JButton("Update") ;
        delete = new JButton("Delete") ;
        bc = new BookController(this) ;
        
        info.setLayout(new GridLayout(3, 2)) ;
        nextback.setLayout(new FlowLayout()) ;
        botton.setLayout(new FlowLayout()) ;
        num.setPreferredSize(new Dimension(50,25));
        
        Object oItem[] = {nl, name, pl, price, tl, type} ;
        for (int i = 0; i < oItem.length ; i++){
            info.add((Component) oItem[i]) ;
        }
        nextback.add(left) ;
        nextback.add(num) ;
        nextback.add(right) ;
        botton.add(add) ;
        botton.add(update) ;
        botton.add(delete) ;
        fr.add(info, BorderLayout.NORTH) ;
        fr.add(nextback, BorderLayout.CENTER) ;
        fr.add(botton, BorderLayout.SOUTH) ;
        left.addActionListener(bc) ;
        right.addActionListener(bc) ;
        add.addActionListener(bc);
        update.addActionListener(bc) ;
        delete.addActionListener(bc) ;
        fr.addWindowListener(bc.getBm());
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.setSize(250, 180); ;
        fr.setResizable(false);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getInfo() {
        return info;
    }

    public void setInfo(JPanel info) {
        this.info = info;
    }

    public JPanel getNextback() {
        return nextback;
    }

    public void setNextback(JPanel nextback) {
        this.nextback = nextback;
    }

    public JPanel getBotton() {
        return botton;
    }

    public void setBotton(JPanel botton) {
        this.botton = botton;
    }

    public JLabel getNl() {
        return nl;
    }

    public void setNl(JLabel nl) {
        this.nl = nl;
    }

    public JLabel getPl() {
        return pl;
    }

    public void setPl(JLabel pl) {
        this.pl = pl;
    }

    public JLabel getTl() {
        return tl;
    }

    public void setTl(JLabel tl) {
        this.tl = tl;
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

    public JTextField getNum() {
        return num;
    }

    public void setNum(JTextField num) {
        this.num = num;
    }

    public JComboBox getType() {
        return type;
    }

    public void setType(JComboBox type) {
        this.type = type;
    }

    public JButton getLeft() {
        return left;
    }

    public void setLeft(JButton left) {
        this.left = left;
    }

    public JButton getRight() {
        return right;
    }

    public void setRight(JButton right) {
        this.right = right;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public JButton getUpdate() {
        return update;
    }

    public void setUpdate(JButton update) {
        this.update = update;
    }

    public JButton getDelete() {
        return delete;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    public String[] getItemList() {
        return itemList;
    }

    public void setItemList(String[] itemList) {
        this.itemList = itemList;
    }

    public BookController getBc() {
        return bc;
    }

    public void setBc(BookController bc) {
        this.bc = bc;
    }
    
}

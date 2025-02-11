import java.awt.* ;
import javax.swing.* ;
public class TellerGUI {
    private JFrame fr ;
    private JPanel p1, p2 ;
    private JButton btd, btw, bte ;
    private JTextField txt1, txt2 ;
    private JLabel lt1, lt2 ;
    private Account user ;
    private BankHandler bh ;

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getP1() {
        return p1;
    }

    public void setP1(JPanel p1) {
        this.p1 = p1;
    }

    public JPanel getP2() {
        return p2;
    }

    public void setP2(JPanel p2) {
        this.p2 = p2;
    }

    public JButton getBtd() {
        return btd;
    }

    public void setBtd(JButton btd) {
        this.btd = btd;
    }

    public JButton getBtw() {
        return btw;
    }

    public void setBtw(JButton btw) {
        this.btw = btw;
    }

    public JButton getBte() {
        return bte;
    }

    public void setBte(JButton bte) {
        this.bte = bte;
    }

    public JTextField getTxt1() {
        return txt1;
    }

    public void setTxt1(JTextField txt1) {
        this.txt1 = txt1;
    }

    public JTextField getTxt2() {
        return txt2;
    }

    public void setTxt2(JTextField txt2) {
        this.txt2 = txt2;
    }

    public JLabel getLt1() {
        return lt1;
    }

    public void setLt1(JLabel lt1) {
        this.lt1 = lt1;
    }

    public JLabel getLt2() {
        return lt2;
    }

    public void setLt2(JLabel lt2) {
        this.lt2 = lt2;
    }

    public Account getUser() {
        return user;
    }

    public void setUser(Account user) {
        this.user = user;
    }

    public TellerGUI(){
        user = new Account() ;
        fr = new JFrame() ;
        p1 = new JPanel() ;
        p2 = new JPanel() ;
        btd = new JButton("Deposit") ;
        btw = new JButton("Withdraw") ;
        bte = new JButton("Exit") ;
        txt1 = new JTextField(Double.toString(user.balance)) ;
        txt2 = new JTextField() ;
        lt1 = new JLabel("Balance") ;
        lt2 = new JLabel("Amount") ;
        bh = new BankHandler(this) ;
        
        fr.setLayout(new BorderLayout()) ;
        p1.setLayout(new GridLayout(2, 2)) ;
        p2.setLayout(new FlowLayout()) ;
        txt1.setEditable(false) ;
        
        p1.add(lt1) ;
        p1.add(txt1) ;
        p1.add(lt2) ;
        p1.add(txt2) ;
        p2.add(btd) ;
        p2.add(btw) ;
        p2.add(bte) ;
        fr.add(p1, BorderLayout.NORTH) ;
        fr.add(p2) ;
        
        btd.addActionListener(bh);
        btw.addActionListener(bh);
        bte.addActionListener(bh);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.setSize(250, 150) ;
        fr.setVisible(true);
    }
}

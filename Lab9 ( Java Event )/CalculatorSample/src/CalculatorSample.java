import java.awt.*;
import javax.swing.*;
public class CalculatorSample {
    
    private JFrame fr ;
    private JPanel p ;
    private JButton btnum0, btnum1, btnum2, btnum3, btnum4, btnum5, btnum6, btnum7, 
            btnum8, btnum9, btp, btmi, btd, btmu, btc, bte ;
    private JTextField txt ;
    private CalculatorHandler ch ;
    private String num, lastAction = null ;
    
    public JFrame getFr() {
        return fr;
    }
    public void setFr(JFrame fr) {
        this.fr = fr;
    }
    public JPanel getP() {
        return p;
    }
    public void setP(JPanel p) {
        this.p = p;
    }
    public JButton getBtnum0() {
        return btnum0;
    }
    public void setBtnum0(JButton btnum0) {
        this.btnum0 = btnum0;
    }
    public JButton getBtnum1() {
        return btnum1;
    }
    public void setBtnum1(JButton btnum1) {
        this.btnum1 = btnum1;
    }

    public JButton getBtnum2() {
        return btnum2;
    }
    public void setBtnum2(JButton btnum2) {
        this.btnum2 = btnum2;
    }
    public JButton getBtnum3() {
        return btnum3;
    }
    public void setBtnum3(JButton btnum3) {
        this.btnum3 = btnum3;
    }
    public JButton getBtnum4() {
        return btnum4;
    }
    public void setBtnum4(JButton btnum4) {
        this.btnum4 = btnum4;
    }
    public JButton getBtnum5() {
        return btnum5;
    }

    public void setBtnum5(JButton btnum5) {
        this.btnum5 = btnum5;
    }

    public JButton getBtnum6() {
        return btnum6;
    }

    public void setBtnum6(JButton btnum6) {
        this.btnum6 = btnum6;
    }
    public JButton getBtnum7() {
        return btnum7;
    }
    public void setBtnum7(JButton btnum7) {
        this.btnum7 = btnum7;
    }
    public JButton getBtnum8() {
        return btnum8;
    }
    public void setBtnum8(JButton btnum8) {
        this.btnum8 = btnum8;
    }
    public JButton getBtnum9() {
        return btnum9;
    }
    public void setBtnum9(JButton btnum9) {
        this.btnum9 = btnum9;
    }
    public JButton getBtp() {
        return btp;
    }
    public void setBtp(JButton btp) {
        this.btp = btp;
    }
    public JButton getBtmi() {
        return btmi;
    }
    public void setBtmi(JButton btmi) {
        this.btmi = btmi;
    }
    public JButton getBtd() {
        return btd;
    }
    public void setBtd(JButton btd) {
        this.btd = btd;
    }
    public JButton getBtmu() {
        return btmu;
    }
    public void setBtmu(JButton btmu) {
        this.btmu = btmu;
    }
    public JButton getBtc() {
        return btc;
    }
    public void setBtc(JButton btc) {
        this.btc = btc;
    }
    public JButton getBte() {
        return bte;
    }
    public void setBte(JButton bte) {
        this.bte = bte;
    }
    public JTextField getTxt() {
        return txt;
    }
    public void setTxt(JTextField txt) {
        this.txt = txt;
    }
    public String getNum() {
        return num ;
    }
    public void setNum(String num) {
        this.num = num ;
    }
    public String getLastAction() {
        return lastAction ;
    }
    public void setLastAction(String lastAction) {
        this.lastAction = lastAction ;
    }
    
    public CalculatorSample(){
        fr = new JFrame("My Calculator") ;
        p = new JPanel() ;
        btnum0 = new JButton("0") ;
        btnum1 = new JButton("1") ;
        btnum2 = new JButton("2") ;
        btnum3 = new JButton("3") ;
        btnum4 = new JButton("4") ;
        btnum5 = new JButton("5") ;
        btnum6 = new JButton("6") ;
        btnum7 = new JButton("7") ;
        btnum8 = new JButton("8") ;
        btnum9 = new JButton("9") ;
        btp = new JButton("+") ;
        btmi = new JButton("-") ;
        btd = new JButton("/") ;
        btmu = new JButton("x") ;
        btc = new JButton("c") ;
        bte = new JButton("=") ;
        txt = new JTextField() ;
        ch = new CalculatorHandler(this) ;
        
        fr.setLayout(new BorderLayout()) ;
        p.setLayout(new GridLayout(4, 4)) ;
        txt.setEditable(false) ;
        p.add(btnum7) ;
        p.add(btnum8) ;
        p.add(btnum9) ;
        p.add(btp) ;
        p.add(btnum4) ;
        p.add(btnum5) ;
        p.add(btnum6) ;
        p.add(btmi) ;
        p.add(btnum1) ;
        p.add(btnum2) ;
        p.add(btnum3) ;
        p.add(btmu) ;
        p.add(btnum0) ;
        p.add(btc) ;
        p.add(bte) ;
        p.add(btd) ;
        fr.add(txt, BorderLayout.NORTH) ;
        fr.add(p) ;
        
        btnum0.addActionListener(ch) ;
        btnum1.addActionListener(ch) ;
        btnum2.addActionListener(ch) ;
        btnum3.addActionListener(ch) ;
        btnum4.addActionListener(ch) ;
        btnum5.addActionListener(ch) ;
        btnum6.addActionListener(ch) ;
        btnum7.addActionListener(ch) ;
        btnum8.addActionListener(ch) ;
        btnum9.addActionListener(ch) ;
        btp.addActionListener(ch) ;
        btd.addActionListener(ch) ;
        btmi.addActionListener(ch) ;
        btmu.addActionListener(ch) ;
        btc.addActionListener(ch) ;
        bte.addActionListener(ch) ;
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.setMinimumSize(new Dimension(250, 250)) ;
        fr.pack() ;
        fr.setVisible(true) ;
    }
}

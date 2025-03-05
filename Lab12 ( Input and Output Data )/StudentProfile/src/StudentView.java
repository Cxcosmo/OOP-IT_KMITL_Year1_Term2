import java.awt.* ;
import javax.swing.* ;
public class StudentView {

    private JFrame fr ;
    private JPanel pb, pinfo ;
    private JButton deposit, withdraw ;
    private JTextField text_id, text_name, text_money ;
    private JLabel lid, lname, lmoney ;
    private Student s ;
    private StudentView_Event se ;
    
    public StudentView(){
        fr = new JFrame("StudentView") ;
        pb = new JPanel() ;
        pinfo = new JPanel() ;
        deposit = new JButton("Deposit") ;
        withdraw = new JButton("Withdraw") ;
        text_id = new JTextField() ;
        text_name = new JTextField() ;
        text_money = new JTextField("0") ;
        lid = new JLabel(" ID:") ;
        lname = new JLabel(" Name:") ;
        lmoney = new JLabel(" Money:") ;
        s = new Student() ;
        se = new StudentView_Event(this) ;
        
        pb.setLayout(new FlowLayout()) ;
        pinfo.setLayout(new GridLayout(3,2)) ;
        text_money.setEditable(false);
        
        pinfo.add(lid) ;
        pinfo.add(text_id) ;
        pinfo.add(lname) ;
        pinfo.add(text_name) ;
        pinfo.add(lmoney) ;
        pinfo.add(text_money) ;
        pb.add(deposit) ;
        pb.add(withdraw) ;
        fr.add(pinfo) ;
        fr.add(pb, BorderLayout.SOUTH) ;
        
        deposit.addActionListener(se) ;
        withdraw.addActionListener(se) ;
        fr.addWindowListener(se); 
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.setSize(250,150 );
        fr.setVisible(true) ;
    }
    
    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JPanel getPb() {
        return pb;
    }

    public void setPb(JPanel pb) {
        this.pb = pb;
    }

    public JPanel getPinfo() {
        return pinfo;
    }

    public void setPinfo(JPanel pinfo) {
        this.pinfo = pinfo;
    }

    public JButton getDeposit() {
        return deposit;
    }

    public void setDeposit(JButton deposit) {
        this.deposit = deposit;
    }

    public JButton getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(JButton withdraw) {
        this.withdraw = withdraw;
    }

    public JTextField getText_id() {
        return text_id;
    }

    public void setText_id(JTextField text_id) {
        this.text_id = text_id;
    }

    public JTextField getText_name() {
        return text_name;
    }

    public void setText_name(JTextField text_name) {
        this.text_name = text_name;
    }

    public JTextField getText_money() {
        return text_money;
    }

    public void setText_money(JTextField text_money) {
        this.text_money = text_money;
    }

    public JLabel getLid() {
        return lid;
    }

    public void setLid(JLabel lid) {
        this.lid = lid;
    }

    public JLabel getLname() {
        return lname;
    }

    public void setLname(JLabel lname) {
        this.lname = lname;
    }

    public JLabel getLmoney() {
        return lmoney;
    }

    public void setLmoney(JLabel lmoney) {
        this.lmoney = lmoney;
    }

    public Student getS() {
        return s;
    }

    public void setS(Student s) {
        this.s = s;
    }

    public StudentView_Event getSe() {
        return se;
    }

    public void setSe(StudentView_Event se) {
        this.se = se;
    }
}

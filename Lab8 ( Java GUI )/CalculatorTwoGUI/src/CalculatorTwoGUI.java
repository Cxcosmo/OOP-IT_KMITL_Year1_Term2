import java.awt.* ;
import javax.swing.* ;
public class CalculatorTwoGUI {
    private JFrame fr ;
    private JPanel p ;
    private JButton btnum0, btnum1, btnum2, btnum3, btnum4, btnum5, btnum6, btnum7, 
            btnum8, btnum9, btp, btmi, btd, btmu, btc, bte ;
    private JTextField txt ;
    public CalculatorTwoGUI(){
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
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.pack() ;
        fr.setVisible(true) ;
    }
}

import java.awt.* ;
import javax.swing.* ;
public class TellerGUI {
    private JFrame fr ;
    private JPanel p1, p2 ;
    private JButton btd, btw, bte ;
    private JTextField txt1, txt2 ;
    private JLabel lt1, lt2 ;
    public TellerGUI(){
        fr = new JFrame() ;
        p1 = new JPanel() ;
        p2 = new JPanel() ;
        btd = new JButton("Deposit") ;
        btw = new JButton("Withdraw") ;
        bte = new JButton("Exit") ;
        txt1 = new JTextField("6000") ;
        txt2 = new JTextField() ;
        lt1 = new JLabel("Balance") ;
        lt2 = new JLabel("Amount") ;
        
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
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.setSize(250, 150) ;
        fr.setVisible(true);
    }
}

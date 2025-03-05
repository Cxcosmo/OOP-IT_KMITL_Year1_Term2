import java.awt.* ;
import javax.swing.* ;
public class ChatDemo {
    private JFrame fr ;
    private JPanel pb ;
    private JTextArea txta ;
    private JTextField txtf ;
    private JButton submit, reset ;
    private ChatDemo_Event ce ;
    
    public ChatDemo() {
        fr = new JFrame("ChatDemo") ;
        pb = new JPanel() ;
        txta = new JTextArea(20, 45) ;
        txtf = new JTextField(45) ;
        submit = new JButton("Submit") ;
        reset = new JButton("Reset") ;
        ce = new ChatDemo_Event(this) ;
        
        fr.setLayout(new BorderLayout()) ;
        pb.setLayout(new FlowLayout()) ;
        txta.setEditable(false) ;
        
        fr.add(txta, BorderLayout.NORTH) ;
        fr.add(txtf) ;
        fr.add(pb, BorderLayout.SOUTH) ;
        pb.add(submit) ;
        pb.add(reset) ;
        
        submit.addActionListener(ce);
        reset.addActionListener(ce);
        fr.addWindowListener(ce);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.pack() ;
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

    public JTextArea getTxta() {
        return txta;
    }

    public void setTxta(JTextArea txta) {
        this.txta = txta;
    }

    public JTextField getTxtf() {
        return txtf;
    }

    public void setTxtf(JTextField txtf) {
        this.txtf = txtf;
    }

    public JButton getSubmit() {
        return submit;
    }

    public void setSubmit(JButton submit) {
        this.submit = submit;
    }

    public JButton getReset() {
        return reset;
    }

    public void setReset(JButton reset) {
        this.reset = reset;
    }
}

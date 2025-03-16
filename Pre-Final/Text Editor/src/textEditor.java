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
public class textEditor {
    private JFrame fr ;
    private JTextArea ta ;
    private JMenuBar mb ;
    private JMenu mfile ;
    private JMenuItem mnew, mopen, msave, mclose ;
    private textEditorController tc ;
    public textEditor(textEditorController tc){
        
        fr = new JFrame("My text Editor") ;
        ta = new JTextArea() ;
        mb = new JMenuBar() ;
        mfile = new JMenu("File") ;
        mnew = new JMenuItem("New") ;
        mopen = new JMenuItem("Open") ;
        msave = new JMenuItem("Save") ;
        mclose = new JMenuItem("Close") ;
        this.tc = tc ;
        
        mb.add(mfile) ;
        mfile.add(mnew) ;
        mfile.add(mopen) ;
        mfile.add(msave) ;
        mfile.addSeparator();
        mfile.add(mclose) ;
        fr.add(ta, BorderLayout.CENTER) ;
        
        fr.setJMenuBar(mb) ;
        ta.setFont(new Font("TH SarabunPSK", 3, 18));
        
        mnew.addActionListener(tc) ;
        mopen.addActionListener(tc) ;
        msave.addActionListener(tc) ;
        mclose.addActionListener(tc) ;
        fr.addWindowListener(tc.getTm());
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300, 300);
        fr.setVisible(true);
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JTextArea getTa() {
        return ta;
    }

    public void setTa(JTextArea ta) {
        this.ta = ta;
    }

    public JMenuBar getMb() {
        return mb;
    }

    public void setMb(JMenuBar mb) {
        this.mb = mb;
    }

    public JMenu getMfile() {
        return mfile;
    }

    public void setMfile(JMenu mfile) {
        this.mfile = mfile;
    }

    public JMenuItem getMnew() {
        return mnew;
    }

    public void setMnew(JMenuItem mnew) {
        this.mnew = mnew;
    }

    public JMenuItem getMopen() {
        return mopen;
    }

    public void setMopen(JMenuItem mopen) {
        this.mopen = mopen;
    }

    public JMenuItem getMsave() {
        return msave;
    }

    public void setMsave(JMenuItem msave) {
        this.msave = msave;
    }

    public JMenuItem getMclose() {
        return mclose;
    }

    public void setMclose(JMenuItem mclose) {
        this.mclose = mclose;
    }

    public textEditorController getTc() {
        return tc;
    }

    public void setTc(textEditorController tc) {
        this.tc = tc;
    }
    
}

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cxcosmo
 */
import java.awt.event.* ;
public class textEditorController implements ActionListener{
    private textEditor te ;
    private textEditorIO tm ;
    public textEditorController(){
        tm = new textEditorIO(this) ;
        te = new textEditor(this) ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(te.getMnew())){
            te.getTa().setText("") ;
        }
        else if (e.getSource().equals(te.getMopen())){
            tm.openFile();
        }
        else if (e.getSource().equals(te.getMsave())){
            tm.saveFile();
        }
        else if (e.getSource().equals(te.getMclose())){
            System.exit(0);
        }
    }

    public textEditor getTe() {
        return te;
    }

    public void setTe(textEditor te) {
        this.te = te;
    }

    public textEditorIO getTm() {
        return tm;
    }

    public void setTm(textEditorIO tm) {
        this.tm = tm;
    }
    
}

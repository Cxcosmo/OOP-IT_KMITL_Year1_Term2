/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cxcosmo
 */
import java.io.* ;
import javax.swing.* ;
import java.awt.event.* ;
public class textEditorIO implements  WindowListener{
    private textEditorController tc ;
    
    public textEditorIO(textEditorController tc){
        this.tc = tc ;
    }

    private void saveData(File f){
        try (FileWriter fw = new FileWriter(f)){
            fw.write(tc.getTe().getTa().getText());
            System.out.println("Save!!!!.");
        } catch (IOException ex) {
            System.out.println("Can't save!");
        }
    }
    
    private void loadData(File f){
        try (FileReader fr = new FileReader(f)){
            StringBuilder txt = new StringBuilder() ;
            int ch ;
            while((ch = fr.read()) != -1 ){
                txt.append((char) ch) ;
            }
            this.tc.getTe().getTa().setText(txt.toString());
            System.out.println("You got it.");
        } catch (IOException ex) {
            System.out.println("Bro I can't read your file.");
        }
    }
    
    public void saveFile(){
        JFileChooser fc = new JFileChooser() ;
        fc.showSaveDialog(null) ;
        File f = fc.getSelectedFile() ;
        saveData(f);
    }
    
    public void openFile(){
        JFileChooser fc = new JFileChooser() ;
        fc.showOpenDialog(null) ;
        File f = fc.getSelectedFile() ;
        if (f != null) {
            loadData(f);
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        loadData(new File("data.txt"));
    }

    @Override
    public void windowClosing(WindowEvent e) {
        saveData(new File("data.txt"));
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
}

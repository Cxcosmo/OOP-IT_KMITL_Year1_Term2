import javax.swing.*;
public class Main {
    public static void main(String[] args) {
//        new MDIFromGUI();
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()) ;
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        SwingUtilities.invokeLater(() -> {new MDIFromGUI();});
    }
}

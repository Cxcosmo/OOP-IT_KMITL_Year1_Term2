import java.awt.* ;
import javax.swing.* ;
public class MDIFromGUI {
    private JFrame fr ;
    private JDesktopPane desktopPane ;
    private JInternalFrame app1, app2, app3 ;
    private JMenuBar menu ;
    private JMenu file, edit, view, n ;
    private JMenuItem open, save, exit, window, message ;
    public MDIFromGUI(){
        fr = new JFrame("SubMenuItem Demo") ;
        desktopPane = new JDesktopPane() ;
        app1 = new JInternalFrame("Application01", true, true, true, true) ;
        app2 = new JInternalFrame("Application02", true, true, true, true) ;
        app3 = new JInternalFrame("Application03", true, true, true, true) ;
        menu = new JMenuBar() ;
        file = new JMenu("File") ;
        edit = new JMenu("Edit") ;
        view = new JMenu("View") ;
        n = new JMenu("New") ;
        open = new JMenuItem("Open") ;
        save = new JMenuItem("Save") ;
        exit = new JMenuItem("Exit") ;
        window = new JMenuItem("Window") ;
        message = new JMenuItem("Message") ;
        
        menu.add(file) ;
        menu.add(edit) ;
        menu.add(view) ;
        file.add(n) ;
        file.add(open) ;
        file.addSeparator() ;
        file.add(save) ;
        file.addSeparator() ;
        file.add(exit) ;
        n.add(window) ;
        n.addSeparator() ;
        n.add(message) ;
        
        fr.add(desktopPane) ;
        fr.setJMenuBar(menu) ;
        fr.setMinimumSize(new Dimension(750, 550)) ;
        
        app1.setSize(200, 150) ;
        int y1 = fr.getHeight() / 2 ;
        app1.setLocation(20, y1);
        app1.setVisible(true) ;
        
        app2.setSize(250, 200) ;
        int x2 = ( app1.getWidth() / 2 ) + app1.getX() ;
        int y2 = app1.getY() - 30 - app2.getHeight() ;
        app2.setLocation(x2,y2);
        app2.setVisible(true) ;
        
        app3.setSize(300, 250) ;
        int x3 = app2.getWidth() + 20 + app2.getX() ;
        int y3 = ( app2.getHeight() * 2 / 3 ) + app2.getY() ;
        app3.setLocation(x3, y3) ;
        app3.setVisible(true) ;
        
        desktopPane.add(app1) ;
        desktopPane.add(app2) ;
        desktopPane.add(app3) ;
        
        fr.pack();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setVisible(true) ;
        
    }
}

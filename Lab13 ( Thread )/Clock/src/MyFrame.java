import java.awt.* ;
import javax.swing.* ;
public class MyFrame {
    
    public static void main(String[] args) {
        JFrame fr = new JFrame() ;
        MyClock clock = new MyClock() ;;
        Thread t = new Thread(clock);
        t.start() ;
        
        fr.add(clock, BorderLayout.CENTER);
        clock.setHorizontalAlignment(JLabel.CENTER);
        clock.setVerticalAlignment(JLabel.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.setResizable(false) ;
        fr.setSize(250,150);
        fr.setVisible(true) ;
    }
}

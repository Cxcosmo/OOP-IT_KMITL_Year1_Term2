import java.awt.* ;
import javax.swing.* ;
public class MyFrame {
    public static void main(String[] args) {
        JFrame fr = new JFrame() ;
        MyTimer timer = new MyTimer() ;
        Thread t = new Thread(timer) ;
        t.start() ;
        
        fr.add(timer, BorderLayout.CENTER);
        timer.setHorizontalAlignment(JLabel.CENTER);
        timer.setVerticalAlignment(JLabel.CENTER);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
        fr.setResizable(false) ;
        fr.setSize(250,150);
        fr.setVisible(true) ;
    }
}

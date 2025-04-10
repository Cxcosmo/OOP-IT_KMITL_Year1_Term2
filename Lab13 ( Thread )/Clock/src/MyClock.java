import java.awt.* ;
import java.util.*;
import javax.swing.* ;
public class MyClock extends JLabel implements Runnable{

    @Override
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance() ;
            int sec = d.get(Calendar.SECOND) ;
            int min = d.get(Calendar.MINUTE) ;
            int hour = d.get(Calendar.HOUR_OF_DAY) ;
            setFont(new Font("Arial", Font.BOLD, 40)) ;
            setText(String.format("%02d:%02d:%02d", hour, min, sec)) ;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error :" + ex.getMessage());
            }
        }
    }
}

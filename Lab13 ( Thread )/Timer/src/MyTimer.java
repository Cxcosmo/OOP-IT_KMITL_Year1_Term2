import java.awt.* ;
import javax.swing.* ;
import java.awt.event.* ;
public class MyTimer extends JLabel implements Runnable, MouseListener{
    private int hour, min, sec, seconds ;
    public boolean running = true ;
    public MyTimer(){
        addMouseListener(this);
    }
    @Override
    public void run() {
        while (true) {
            hour = sec / 3600 ;
            min  = (seconds % 3600) / 60 ;
            sec = seconds % 60 ;
            setFont(new Font("Arial", Font.BOLD, 40)) ;
            setText(String.format("%02d:%02d:%02d", hour, min, sec)) ;
            if (running == true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    System.out.println("Error :" + ex.getMessage());
                }
                seconds++ ;
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        running = !running ;
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}

import java.awt.event.* ;
import javax.swing.* ;
public class Poring_event implements MouseListener{
    private Poring p ;
    public Poring_event(Poring p){
        this.p = p ;
    }

    @Override
    public synchronized void mouseClicked(MouseEvent e) {
        p.getFr().dispose();
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

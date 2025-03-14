import java.awt.* ;
import javax.swing.* ;
import java.util.Random;
public class Poring implements Runnable{
    private JFrame fr ;
    private JLabel lb;
    private Poring_event pe ;
    private Dimension screenSize ;
    private double width, height ;
    private Random random ;
    public Poring(int count){
        Image image = new ImageIcon(Poring.class.getResource("/resources/Poring.png")).getImage() ;
        Image resizedImage = image.getScaledInstance(150, 150, Image.SCALE_SMOOTH) ;
        ImageIcon poring = new ImageIcon(resizedImage) ;
        lb = new JLabel(poring) ;
        fr = new JFrame() ;
        pe = new Poring_event(this) ;
        random = new Random() ;
        screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        width = screenSize.getWidth();
        height = screenSize.getHeight();
        
        lb.setText(Integer.toString(count)) ;
        lb.setHorizontalTextPosition(JLabel.RIGHT) ;
        
        fr.add(lb) ;
        lb.addMouseListener(pe) ;
        
        fr.setSize(200,150); ;
        fr.setLocation(random.nextInt((int)width - fr.getWidth()),random.nextInt((int)height) - fr.getHeight());
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE) ;
        fr.setResizable(false) ;
        fr.setVisible(true) ;
    }
    
    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JLabel getLb() {
        return lb;
    }

    public void setLb(JLabel lb) {
        this.lb = lb;
    }

    public Poring_event getPe() {
        return pe;
    }

    public void setPe(Poring_event pe) {
        this.pe = pe;
    }

    @Override
    public void run() {
        while(true){
            int x = (int)(fr.getX() + random.nextInt(11) - 5) ;
            int y = (int)(fr.getY() + random.nextInt(11) - 5) ;
            if (x < 0){ x = 0 ; }
            else if (x > width){ x = (int)width; }
            if (y < 0){ y = 0 ; }
            else if (y > height){ y = (int)height; }
            fr.setLocation(x, y) ;
            try { 
                Thread.sleep(80) ;
            } catch (InterruptedException ex) {
                System.out.println("Error : " + ex.getMessage()) ;
            }
        }
    }
}

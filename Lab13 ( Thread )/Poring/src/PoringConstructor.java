import java.awt.* ;
import javax.swing.* ;
public class PoringConstructor {
    private int count ;
    private JFrame fr ;
    private JButton add ;
    private Poring_Con_Event pe ;
    public PoringConstructor(){
        fr = new JFrame() ;
        add = new JButton("Add") ;
        pe = new Poring_Con_Event(this) ;
        
        fr.setLayout(new FlowLayout());
        
        fr.add(add) ;
        add.addActionListener(pe);
        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (screenSize.width - fr.getWidth()) / 2;
        int centerY = (screenSize.height - fr.getHeight()) / 2;
        fr.setLocation(centerX, centerY);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setResizable(false);
        fr.setVisible(true);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public JFrame getFr() {
        return fr;
    }

    public void setFr(JFrame fr) {
        this.fr = fr;
    }

    public JButton getAdd() {
        return add;
    }

    public void setAdd(JButton add) {
        this.add = add;
    }

    public Poring_Con_Event getPe() {
        return pe;
    }

    public void setPe(Poring_Con_Event pe) {
        this.pe = pe;
    }
}

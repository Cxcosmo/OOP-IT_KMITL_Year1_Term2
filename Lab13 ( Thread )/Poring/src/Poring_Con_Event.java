import java.awt.event.* ;
public class Poring_Con_Event implements ActionListener{
    private PoringConstructor pc ;
    public Poring_Con_Event(PoringConstructor pc){
        this.pc = pc ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(pc.getAdd())){
            pc.setCount(pc.getCount() + 1) ;
            Poring pr = new Poring(pc.getCount()) ;
            Thread tp = new Thread(pr) ;
            tp.start() ;
        }
    }
}

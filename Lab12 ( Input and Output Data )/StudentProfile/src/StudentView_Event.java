import java.awt.event.* ;
import java.io.* ;
public class StudentView_Event implements ActionListener, WindowListener{
    private StudentView sv ;
    public StudentView_Event(StudentView sv){
        this.sv = sv ;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.sv.getDeposit())){
            if (!"".equals(this.sv.getText_id().getText()) && !"".equals(this.sv.getText_name().getText())){
                this.sv.getS().setID(Integer.parseInt(this.sv.getText_id().getText())) ;
                this.sv.getS().setName(this.sv.getText_name().getText()) ;
                this.sv.getS().setMoney(this.sv.getS().getMoney() + 100) ;
            }
        }
        else if (e.getSource().equals(this.sv.getWithdraw())){
            if ((Integer.toString(this.sv.getS().getID())).equals(this.sv.getText_id().getText()) && (this.sv.getS().getName()).equals(this.sv.getText_name().getText())){
                if (this.sv.getS().getMoney() - 100 >= 0){
                    this.sv.getS().setMoney(this.sv.getS().getMoney() - 100) ;
                }
                else {
                    this.sv.getS().setMoney(0) ;
                }
            }
        }
        this.sv.getText_money().setText(Integer.toString(this.sv.getS().getMoney())) ;
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try (ObjectInputStream in_Obj = new ObjectInputStream(new FileInputStream("StudentM.dat"))){
            this.sv.setS((Student) in_Obj.readObject()) ;
            if (this.sv.getS().getID() != 0){
                this.sv.getText_id().setText(Integer.toString(this.sv.getS().getID())) ;
            }
            this.sv.getText_name().setText(this.sv.getS().getName());
            this.sv.getText_money().setText(Integer.toString(this.sv.getS().getMoney()));
            System.out.println("Load File Already!") ;
        } catch (IOException i){
            System.out.println("File Load Error!") ;
        } catch (ClassNotFoundException cnf){
            System.out.println("File Not Found!") ;
        }
    }
    
    @Override
    public void windowClosing(WindowEvent e) {
        if ("".equals(this.sv.getText_id().getText()) || "".equals(this.sv.getText_name().getText())){
            this.sv.getS().setID(0) ;
            this.sv.getS().setName("") ;
            this.sv.getS().setMoney(0) ;
        }
        try (ObjectOutputStream out_Obj = new ObjectOutputStream(new FileOutputStream("StudentM.dat"))){
            out_Obj.writeObject(this.sv.getS()) ;
            System.out.println("Save Already!") ;
        } catch (IOException i){
            System.out.println("File Write Error!") ;
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {}

    @Override
    public void windowIconified(WindowEvent e) {}

    @Override
    public void windowDeiconified(WindowEvent e) {}

    @Override
    public void windowActivated(WindowEvent e) {}

    @Override
    public void windowDeactivated(WindowEvent e) {}
    
}

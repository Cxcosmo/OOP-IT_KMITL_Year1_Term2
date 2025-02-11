import java.awt.event.* ;
public class BankHandler implements ActionListener{
    private TellerGUI tg ;
    public BankHandler(TellerGUI tg){
        this.tg = tg ;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(this.tg.getBtw())){
            this.tg.getUser().withdraw(Double.parseDouble(this.tg.getTxt2().getText())) ;
        }
        else if (e.getSource().equals(this.tg.getBtd())){
            this.tg.getUser().deposit(Double.parseDouble(this.tg.getTxt2().getText())) ;
        }
        else if (e.getSource().equals(this.tg.getBte())){
            System.exit(0);
        }
        this.tg.getTxt1().setText( Double.toString(this.tg.getUser().balance ) );
    }
    
}

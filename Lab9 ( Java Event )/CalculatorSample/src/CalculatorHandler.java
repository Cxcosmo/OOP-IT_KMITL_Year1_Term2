import java.awt.event.* ;
public class CalculatorHandler implements ActionListener {
    private CalculatorSample cs ;
    public CalculatorHandler(CalculatorSample cs){
        this.cs = cs ;
    }
    private void LastAction(){
        if ( "p".equals(this.cs.getLastAction()) ){
            this.cs.setNum(Double.toString(Double.parseDouble(this.cs.getNum()) + Double.parseDouble(this.cs.getTxt().getText()))) ;
        }
        else if ( "mi".equals(this.cs.getLastAction()) ){
            this.cs.setNum(Double.toString(Double.parseDouble(this.cs.getNum()) - Double.parseDouble(this.cs.getTxt().getText()))) ;
        }
        else if ( "mu".equals(this.cs.getLastAction()) ){
            this.cs.setNum(Double.toString(Double.parseDouble(this.cs.getNum()) * Double.parseDouble(this.cs.getTxt().getText()))) ;
        }
        else if ( "d".equals(this.cs.getLastAction()) ){
            this.cs.setNum(Double.toString(Double.parseDouble(this.cs.getNum()) / Double.parseDouble(this.cs.getTxt().getText()))) ;
        }
    }
    
    @Override 
    public void actionPerformed(ActionEvent e) {
        if ("Error".equals(this.cs.getTxt().getText())){
            this.cs.getTxt().setText("") ;
        }
        if (e.getSource().equals(this.cs.getBtnum0())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "0");
        }
        else if (e.getSource().equals(this.cs.getBtnum1())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "1");
        }
        else if (e.getSource().equals(this.cs.getBtnum2())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "2");
        }
        else if (e.getSource().equals(this.cs.getBtnum3())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "3");
        }
        else if (e.getSource().equals(this.cs.getBtnum4())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "4");
        }
        else if (e.getSource().equals(this.cs.getBtnum5())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "5");
        }
        else if (e.getSource().equals(this.cs.getBtnum6())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "6");
        }
        else if (e.getSource().equals(this.cs.getBtnum7())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "7");
        }
        else if (e.getSource().equals(this.cs.getBtnum8())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "8");
        }
        else if (e.getSource().equals(this.cs.getBtnum9())){
            this.cs.getTxt().setText(this.cs.getTxt().getText() + "9");
        }
        else if (e.getSource().equals(this.cs.getBtc())){
            this.cs.getTxt().setText("");
            this.cs.setNum(null) ;
            this.cs.setLastAction(null ) ;
        }
        
        else if (e.getSource().equals(this.cs.getBtp())){
            if ( !"".equals(this.cs.getTxt().getText()) ){
                if ( this.cs.getNum() != null ){
                    LastAction() ;
                }
                else {
                    this.cs.setNum(this.cs.getTxt().getText()) ;
                }
                this.cs.setLastAction("p");
                this.cs.getTxt().setText("");
            }
            else {
                if ( this.cs.getLastAction() != null ){
                    this.cs.setLastAction("p");
                }
                else {
                    this.cs.getTxt().setText("Error") ;
                }
            }
        }
        
        else if (e.getSource().equals(this.cs.getBtmi())){
            if ( !"".equals(this.cs.getTxt().getText()) ){
                if ( this.cs.getNum() != null ){
                    LastAction() ;
                }
                else {
                    this.cs.setNum(this.cs.getTxt().getText()) ;
                }
                this.cs.setLastAction("mi");
                this.cs.getTxt().setText("");
            }
            else {
                if ( this.cs.getLastAction() != null ){
                    this.cs.setLastAction("mi");
                }
                else {
                    this.cs.getTxt().setText("Error") ;
                }
            }
        }
        
        else if (e.getSource().equals(this.cs.getBtmu())){
            if ( !"".equals(this.cs.getTxt().getText()) ){
                if ( this.cs.getNum() != null ){
                    LastAction() ;
                }
                else {
                    this.cs.setNum(this.cs.getTxt().getText()) ;
                }
                this.cs.setLastAction("mu");
                this.cs.getTxt().setText("");
            }
            else {
                if ( this.cs.getLastAction() != null ){
                    this.cs.setLastAction("mu");
                }
                else {
                    this.cs.getTxt().setText("Error") ;
                }
            }
        }
        
        else if (e.getSource().equals(this.cs.getBtd())){
            if ( !"".equals(this.cs.getTxt().getText()) ){
                if ( this.cs.getNum() != null ){
                    LastAction() ;
                }
                else {
                    this.cs.setNum(this.cs.getTxt().getText()) ;
                }
                this.cs.setLastAction("d");
                this.cs.getTxt().setText("");
            }
            else {
                if ( this.cs.getLastAction() != null ){
                    this.cs.setLastAction("d");
                }
                else {
                    this.cs.getTxt().setText("Error") ;
                }
            }
        }
        
        else if (e.getSource().equals(this.cs.getBte())){
            if ( "".equals( this.cs.getTxt().getText()) ){
                this.cs.getTxt().setText("Error") ;
                return ;
            }
            if ( this.cs.getNum() != null ){
                LastAction() ;
            
                this.cs.getTxt().setText(this.cs.getNum());
                this.cs.setNum(null);
            }
            else {
                
            }
        }
    }
}

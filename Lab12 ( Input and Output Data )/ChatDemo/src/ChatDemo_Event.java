import java.awt.event.* ;
import java.time.LocalDateTime ;
import java.time.format.DateTimeFormatter ;
import java.io.* ;
import javax.swing.JFrame;
public class ChatDemo_Event implements ActionListener, WindowListener {
    private ChatDemo cd ;
    public ChatDemo_Event(ChatDemo cd){
        this.cd = cd ;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss") ;
        if (e.getSource().equals(this.cd.getSubmit())){
            if (!this.cd.getTxtf().getText().equals("")) {
                this.cd.getTxta().setText(this.cd.getTxta().getText() + "\n" + dtf.format(LocalDateTime.now()) + " : " + this.cd.getTxtf().getText()) ;
                this.cd.getTxtf().setText(null) ;
            }
        }else if (e.getSource().equals(this.cd.getReset())){
            this.cd.getTxta().setText(null) ;
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {
        try (FileInputStream fin = new FileInputStream("ChatDemo.dat")) {
            StringBuilder content = new StringBuilder();
            int ch;
            while ((ch = fin.read()) != -1) {
                content.append((char) ch);
            }
            this.cd.getTxta().setText(content.toString());
        } catch (IOException ioe) {
            System.out.println("File Read Error: " + ioe.getMessage());
            System.exit(0);
        }
    }

    @Override
    public void windowClosing(WindowEvent e) {
        try (FileOutputStream fout = new FileOutputStream("ChatDemo.dat")) {
            fout.write(this.cd.getTxta().getText().getBytes());
        } catch (IOException ioe) {
            System.out.println("File Write Error: " + ioe.getMessage());
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

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Container;
   
   public class Rafael extends JFrame{
    Rafael(String title){
        setTitle(title);
          setSize(400,400);
          setLocation(400,400);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          
          JButton btn = new JButton("click!!");
          
          JPanel panel = new JPanel();
          panel.add(btn);
        Container cp = getContentPane();
        cp.add(panel,BorderLayout.CENTER);
          
      }
      public static void main(String[] args){
          Rafael Hello = new Rafael("ALOHA");
          Hello.setVisible(true);
       }
   }

   import javax.swing.*;
   import java.awt.*;
   import java.io.*;
   
   public class Sakiyama extends JFrame{
   	Sakiyama(String title){
    		setTitle(title);
      		setSize(500,500);
      		setLocation(500,500);
      		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		
         	JPanel panel = new JPanel();
          
          JLabel lbl = new JLabel("mail");
          JTextField jtf = new JTextField("",20);
          
          panel.add(lbl);
          panel.add(jtf,BorderLayout.NORTH);
          
          Container cp = getContentPane();
          cp.add(panel,BorderLayout.NORTH);
     	}
      public static void main(String[] args){
      		Sakiyama aloha = new Sakiyama("ALOHA");
        	aloha.setVisible(true);
        	
      }
   }
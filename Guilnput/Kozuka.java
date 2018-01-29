      import javax.swing.JFrame;
      import javax.swing.JPanel;
      import javax.swing.JButton;
      import javax.swing.JTextField;
      import java.awt.BorderLayout;
      import java.awt.Container;
      import java.io.BufferedWriter;
      import java.io.IOException;
      import java.io.FileWriter;
      import java.util.Scanner;
      
      public class Kozuka extends JFrame{
        Kozuka(String title){
          setTitle(title);
            setSize(400,400);
             setLocation(400,400);
             setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
             JButton btn = new JButton("click!!");
             
             JTextField jtf = new JTextField("",20);
             
             JPanel panel = new JPanel();
             panel.add(btn);
             panel.add(jtf,BorderLayout.NORTH);
          Container cp = getContentPane();
          cp.add(panel,BorderLayout.CENTER);
             
        }
          public static void main(String[] args){
            Kozuka Hello = new Kozuka("ALOHA");
            Hello.setVisible(true);
            try{
              FileWriter fw = new FileWriter("data.txt",true);
              BufferedWriter bw = new BufferedWriter(fw);
                String userData = "";
               
               while(true){
                System.out.println("input msg");
                  userData = new Scanner(System.in).nextLine();
                 
                  if(userData.equals("exit"))break;
                    bw.write(userData+"\n");
               }
               bw.close();
               } catch (IOException e){
                System.out.println("file writing .........failed");
            }
          }
      }
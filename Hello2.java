import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello2 extends JFrame{
	
	Hello2(String title){
		setTitle(title);
		setSize(200,200);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JButton btn = new JButton("ALOHA");

	}

	public static void main(String[] args){
		Hello2 hello = new Hello2("ALOHA");
		hello.setVisible(true);
	}
}
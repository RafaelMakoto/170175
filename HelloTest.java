import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Container;
import java.awt.BorderLayout;

public class HelloTest extends JFrame{
	HelloTest(String title){
		setTitle(title);
		setSize(2000,2000);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOCE);

		JButton btn  = new JButton("Click ME");

		JPanel panel = new JPanel();

		panel.add(btn);

		Container cp = getContenPane();
		cp.add(panel,BorderLayout.CENTER);
	}
	public static void main(String[] atgs){
		HelloTest ht= new HelloTest("ALOHA");
		ht.setVisible(true);
	}
}
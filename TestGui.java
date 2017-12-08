import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Container;
import java.awt.BorderLayout;

public class TestGui extends JFrame{
	TestGui(String title){
		
		setTitle(title);
		setSize(2000,2000);
		setLocation(0,0);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JTextField jtf = new JTextField("",20);
		JPasswordField jpf = new JPasswordField("ALOHA");

		panel.add(jtf,BorderLayout.NORTH);
		panel.add(jtf,BorderLayout.NORTH);
	
		Container cp = getContenPane();
		cp.add(panel, BorderLayout.CENTER);

	}
	public static void main(String[] args){
		TestGui TG = new TestGui("ALOHA");
		TG.setVisible(true);
	}
}

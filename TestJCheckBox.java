import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Label;
import java.awt.BorderLayout;
import java.awt.Container;

public class TestJCheckBox extends JFrame{
	TestJCheckBox(String title){
		setTitle(title);
		setSize(500,500);
		setLovation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();

		JCheckBOox c1 = new JCheckBOox("A");
		JCheckBOox c2 = new JCheckBOox("B");
		JCheckBOox c3 = new JCheckBOox("C");

		panel.add(c1);
		panel.add(c3);
		panel.add(c3);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);

	}
	public static void main(String[] args){
			TestCheckBox tcb = new TestCheckBox("Windos");
			txb.setVisible(true);
	}
}
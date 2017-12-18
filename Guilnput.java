import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Guilnput extends JFrame implements ActionListener{
	//data
	private JTextField field;
	//method
	public void actionPerformed(ActionEvent e){
		this.field.setText("ALOHA!");
	}
	Guilnput(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JButton btn = new JButton("CLIIK");
		btn.addActionListener(this);

		this.field = new JTextField("Hello", 15);

		JCheckBox a1 = new JCheckBox("A");
		JCheckBox b2 = new JCheckBox("B");
		JCheckBox c3 = new JCheckBox("C");

		panel.add(a1);
		panel.add(b2);
		panel.add(c3);
		panel.add(btn);
		panel.add(this.field);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);
	}
	public static void main(String[] args){
			Guilnput windos = new Guilnput("windos");
			windos.setVisible(true);
	}
}
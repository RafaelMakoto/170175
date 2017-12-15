import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloCheckBox1 extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("CLICK!");
	}

	HelloCheckBox1(String title){
		setTitle(title);
		setLocation(0,0);
		setSize(2000,2000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JPanel msg = new JPanel();

		JCheckBox c1 = new JCheckBox("katuta");
		JCheckBox c2 = new JCheckBox("kensuke");
		JCheckBox c3 = new JCheckBox("kebabu");
		JButton btn = new JButton("OK");

		
		
		Container cp = getContentPane();
			cp.add(panel,BorderLayout.NORTH);
			cp.add(msg, BorderLayout.CENTER);
	}
}
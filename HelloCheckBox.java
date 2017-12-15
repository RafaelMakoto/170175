import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloCheckBox extends JFrame implements ActionListener{
	
	JLabel label;
	JCheckBox c1;

public static void main(String[] atgs){
		HelloCheckBox frame = new HelloCheckBox("HEllo");
		frame.setVisible(true);
}
	HelloCheckBox(String title){
		setTitle(title);
		setLocation(0,0);
		setSize(2000,2000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		JPanel msg = new JPanel();
		JLabel label = new JLabel("AloHA");
		panel.setLayout(new GridLayout(3,1));

		JCheckBox c1 = new JCheckBox("katuta");
		JCheckBox c2 = new JCheckBox("kensuke");
		JCheckBox c3 = new JCheckBox("kebabu");
		JButton btn = new JButton("OK");

		panel.add(c1);
		panel.add(c2);
		panel.add(c3);
		panel.add(btn);

		Container cp = getContentPane();
			cp.add(panel,BorderLayout.NORTH);
			cp.add(msg, BorderLayout.CENTER);
	}

	public void actionPerformed(ActionEvent e){
		if(this.c1.isSelected()){
			this.label.setText("check1");
		}
		//System.out.println("Click");
	}

}
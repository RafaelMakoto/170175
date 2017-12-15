import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu extends JFrame implements ActionListener{
		JLabel label;
		JCheckBox jb;

		public static void main(String[] args){
			Fukushu windos = new Fukushu("Helllo");
				windos.setVisible(true);
		}

		Fukushu(String title){
			setTitle(title);
			setLocation(0,0);
			setSize(2000,2000);
			setDefaultCloseOperation(EXIT_ON_CLOSE);

			JPanel panel = new JPanel();
			this.label = new JLabel("Hello");
			this.jb = new JCheckBox("sasd");
			JButton btn = new JButton("ok");
			btn.addActionListener(this);

			panel.add(jb);
			panel.add(this.label);
			panel.add(btn);
			Container cp = getContentPane();
				cp.add(panel, BorderLayout.NORTH);
		}
		public void actionPerformed(ActionEvent e){
			if(this.jb.isSelected()){
				this.label.setText(this.jb.getText()+"check1");
			} else {
				this.label.setText("nasi");
			}
		}
}
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
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

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
			bw.close();} catch (IOException e){
			System.out.println("file writing.....failed!");

		}
	}
}
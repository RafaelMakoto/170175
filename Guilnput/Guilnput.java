import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileReader;
import java.awt.GridLayout;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class Guilnput extends JFrame {
	//data
	private JTextField field;
	//method

	Guilnput(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		
		JLabel lbl = new JLabel("mail");
		JLabel lbl2 = new JLabel("");
		JTextField jtf = new JTextField("",20); 

		panel.add(lbl);
		panel.add(lbl2);
		
		panel.setLayout(new GridLayout(2,2));
		panel.add(jtf,BorderLayout.NORTH);

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
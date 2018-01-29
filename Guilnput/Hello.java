import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Hello extends JFrame{

	Hello(String title){
		setTitle(title);
		setSize(500,500);
		setLocation(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel pl = new JPanel();

		JPasswordFild jtf = new JPasswordFild("AHOHA");

		pl.add(jtf.BorderLayout.NORTH);
		pl.add(jtf.BorderLayout.NORTH);

		Container cp = getContentPane();
		cp.add(pl,BorderLayout.CENTER);
	}

	public static void main(String[] args){
		Hello hello = new Hello("NEW YAER");
		hello.setVisible(true);
	}
}
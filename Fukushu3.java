import javax.swing.*;
import java.awt.*;

public class Fukushu3 extends JFrame{

	Fukushu3(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JMenuBar
		JMenuBar menubar = new JMenuBar();
		// JPanl
		JPanel panel = new JPanel();
		//setLayout
		panel.setLayout(new GridLayout(3,1));
		//JRadioButton
		JRadioButton rbtn1 = new JRadioButton("HELLO");
		JRadioButton rbtn2 = new JRadioButton("ALOHA");
		JRadioButton rbtn3 = new JRadioButton("BONJIA");
		//JMenu
		JMenu menu1 = new JMenu("File");
		JMenu menu2 = new JMenu("Edit");
		JMenu menu3 = new JMenu("Help");

		//JMenuItem(File)
		JMenuItem newItem = new JMenuItem("new");
		JMenuItem openItem = new JMenuItem("open");
		JMenuItem closeItem = new JMenuItem("close");
		//JMenuItem(Edit)
		JMenuItem cutItem = new JMenuItem("cut");
		JMenuItem copyItem = new JMenuItem("copy");
		JMenuItem pasteItem = new JMenuItem("paste");
		//JeMenuItem(Help)
		JMenuItem versionItem = new JMenuItem("version");
		JMenuItem indexItem = new JMenuItem("index");
		//JCheckBox
		JCheckBox check1 = new JCheckBox("CLIIK ME");
		JCheckBox check2 = new JCheckBox("Check");
		JCheckBox check3 = new JCheckBox("Check Check");

		//set,add
		setJMenuBar(menubar);
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		//File
		menu1.add(newItem);
		menu1.add(openItem);
		menu1.add(closeItem);
		//Edit
		menu2.add(cutItem);
		menu2.add(openItem);
		menu2.add(pasteItem);
		//Help
		menu3.add(versionItem);
		menu3.add(indexItem);
		//panel.add
		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);
		//panl.CheckBox
		panel.add(check1);
		panel.add(check2);
		panel.add(check3);

		Container cp = getContentPane();
		cp.add(panel,BorderLayout.NORTH);

	}

	//main
	public static void main(String[] args){
		Fukushu3 frame =new Fukushu3("NEMUI");
		frame.setVisible(true);
	}
}
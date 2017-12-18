import javax.swing.*;
import java.awt.*;

public class Fukushu1 extends JFrame{

	Fukushu1(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// JMenuBar
		JMenuBar menubar = new JMenuBar();

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
	}

	//main
	public static void main(String[] args){
		Fukushu1 frame =new Fukushu1("NEMUI");
		frame.setVisible(true);
	}
}
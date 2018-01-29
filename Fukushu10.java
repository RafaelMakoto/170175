import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fukushu10 extends JFrame implements ActionListener {
	//data
	private JLabel label;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;

	//method
	public void actionPerformed(ActionEvent e){
		//
		Boolean kekka1 = this.rbtn1.isSelected();
		Boolean kekka2 = this.rbtn2.isSelected();
		Boolean kekka3 = this.rbtn3.isSelected();
		//
		String msg = "";
		if(kekka1){
			msg=this.rbtn1.getText()+"ok";
				this.label.setText(msg);
		}
		if(kekka2){
			msg=this.rbtn2.getText()+"ok";
				this.label.setText(msg);
		}
		if(kekka2){
			msg=this.rbtn3.getText()+"ok";
				this.label.setText(msg);
		}
	}

	Fukushu10(String title){
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
		this.rbtn1 = new JRadioButton("HELLO");
		this.rbtn2 = new JRadioButton("ALOHA");
		this.rbtn3 = new JRadioButton("BONJIA");
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
		//ButtonGroup
		ButtonGroup rBtnGroup = new ButtonGroup();
		rBtnGroup.add(this.rbtn1);
		rBtnGroup.add(this.rbtn2);
		rBtnGroup.add(this.rbtn3);
		JButton btn = new JButton("clik me");
		btn.addActionListener(this);
		//JLabel
		this.label = new JLabel("here is a label");

		//set,add
		setJMenuBar(menubar);
		menubar.add(menu1);
		menubar.add(menu2);
		menubar.add(menu3);
		panel.add(btn);
		panel.add(this.label);
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
		Fukushu4 frame =new Fukushu4("NEMUI");
		frame.setVisible(true);
	}
}
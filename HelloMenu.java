import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloMenu extends JFrame implements ActionListener{
	//data
	private JLabel label;
	private JRadioButton rbtn1;
	private JRadioButton rbtn2;
	private JRadioButton rbtn3;

	//method
	public void actionPerformed(ActionEvent e){
		//sentakusareteiruka
		Boolean kekka1 = this.rbtn1.isSelected();
		Boolean kekka2 = this.rbtn2.isSelected();
		Boolean kekka3 = this.rbtn3.isSelected();

		//sirabeta kekkawokakikomu
		String msg = "";
		if(kekka1){
			msg = this.rbtn1.getText()+"ok";
			this.label.setText(msg);
		}
		if(kekka2){
			msg = this.rbtn2.getText()+"ok";
			this.label.setText(msg);
		}
		if(kekka3){
			msg = this.rbtn3.getText()+"ok";
			this.label.setText(msg);
		}
	}
	HelloMenu(String title){
		//JFrame
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//JMenuBar
		JMenuBar menubar = new JMenuBar();
		//JMenu
		JMenu menu1 = new JMenu("File");
		//JMenuItem
		JMenuItem menuItem1 = new JMenuItem("new");
		JMenuItem menuItem2 = new JMenuItem("open");

		//JRadioButton
		this.rbtn1 = new JRadioButton("Hallo");
		this.rbtn2 = new JRadioButton("ALOHA");
		this.rbtn3 = new JRadioButton("OHAYOU");
		//ButtonGroup
		ButtonGroup rBtnGroup = new ButtonGroup();
		rBtnGroup.add(this.rbtn1);
		rBtnGroup.add(this.rbtn2);
		rBtnGroup.add(this.rbtn3);
		//JButton
		JButton btn = new JButton("clil me");
		btn.addActionListener(this);
		//JLabel
		this.label = new JLabel("here is a label");

		//set,add .JPanel=3
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5,1));
		panel.add(rbtn1);
		panel.add(rbtn2);
		panel.add(rbtn3);
		panel.add(btn);
		panel.add(this.label);
		
		//set, add .JMenu
		setJMenuBar(menubar);
		menubar.add(menu1);
		menu1.add(menuItem1);
		menu1.add(menuItem2);

		//Container
		Container cp = getContentPane();
		cp.add(panel, BorderLayout.NORTH);
	}
	//main
	public static void main(String[] args){
		HelloMenu frame = new HelloMenu("AlOHA");
		frame.setVisible(true);
	}
}
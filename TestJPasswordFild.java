import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JPasswordFild;
import java.awt.Container;
import java.awt.Borderlayout;

public class TestJPasswordFild{
	TestJPasswordFild(String title){

		setTitle(title);
		setSize(2000,2000);
		setLocation(0,0);
		setDefaultClosePerarion(JFrame.EXIt_ON_CLOCE);

		JPanel panel =new JPanel();

		JTextField jtf = new JTextField("",20);
		JpasswordFild jpf = new JpasswordFild("ALOHA");

		panel.add(jtf,Borderlayout.NORTH);
		panel.add(jtf,Borderlayout.NORTH);

		Container cp = getContenPane();
		cp.add(panel,Borderlayout.CENTER);
	}
	public static void main(String[] args){
		TestJPasswordFild tp = new TestJPasswordFild("ALOHA");
		tp.setVisible(true);
	}
}
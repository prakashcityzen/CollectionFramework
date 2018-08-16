
import javax.swing.*;

public class Login extends JFrame{
	public Login()
	{
	JPanel jp=new JPanel();
	JLabel j1=new JLabel("Username");
	JTextField un=new JTextField(20);
	JLabel j12=new JLabel("Password");
	JPasswordField psw=new JPasswordField(20);
	JButton log= new JButton("Login");
	JButton can= new JButton("Cancel");
	jp.add(j1);
	jp.add(un);
	jp.add(j12);
	jp.add(psw);
	jp.add(can);
	add(jp);
	setTitle("LOgin Page");
	setVisible(true);//jframe ko method ho set visible
	setSize(600,600);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public  static void main(String [] args)
	{
		new Login();
	}
}

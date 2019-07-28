package sign;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Index {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("index");
		FlowLayout fl = new FlowLayout();
		jf.setSize(200, 350);
		jf.getContentPane().setLayout(fl);
		
		
		
		JButton jb1 = new JButton("로그인");
		jb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
			}
		});
		JButton jb2 = new JButton("회원가입");
		jb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp singup = new SignUp();
			}
		});

		jf.getContentPane().add(jb1);
		jf.getContentPane().add(jb2);
		
		
		jf.setVisible(true);
		
		
		
		
	}

}

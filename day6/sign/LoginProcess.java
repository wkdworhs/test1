package sign;

import java.awt.FlowLayout;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.Closeable;
import java.awt.event.ActionEvent;

public class LoginProcess {

	public LoginProcess() {
		JFrame jf = new JFrame("로그인");
		FlowLayout fl = new FlowLayout();
		jf.getContentPane().setLayout(fl);
		jf.setSize(200, 350);
		
		
		DB db = new DB();
		

		
		JLabel jl1 = new JLabel("아이디 :");
		JLabel jl2 = new JLabel("패스워드 :");

		JTextField jt1 = new JTextField(10);
		
		JTextField jt2 = new JTextField(10);
		

		JButton jb = new JButton("로그인");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					String a = jt1.getText();
					String b = jt2.getText();
					
					for(int i =0 ;i < 3 ; i++ ) {
						
						if (a.equals(db.DBid(i))) {
							if (b.equals(db.DBpw(i))) {
								Main.main(null);
								System.out.println("성공");
							}
						} else {
							Index.main(null);
							System.out.println("실패");
						}
						
					}
					
				
				

			}
		});

		jf.getContentPane().add(jl1);
		jf.getContentPane().add(jt1);

		jf.getContentPane().add(jl2);
		jf.getContentPane().add(jt2);

		jf.getContentPane().add(jb);

		jf.setVisible(true);

	}

}

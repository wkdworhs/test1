package sign;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SignUpProcess {
	public SignUpProcess() {
		JFrame jf = new JFrame("ȸ������");
		FlowLayout fl = new FlowLayout();
		jf.setSize(200, 350);
		jf.setLayout(fl);
		
		JLabel jl1 = new JLabel("���̵� :");
		JTextField jt1 = new JTextField(10);
		
		JLabel jl2 = new JLabel("��й�ȣ :");
		JTextField jt2 = new JTextField(10);
		
		JLabel jl3 = new JLabel("�ּ� :");
		JTextField jt3 = new JTextField(10);
		
		JButton jb1 = new JButton("����");
		
		jf.add(jl1);
		jf.add(jt1);
		
		jf.add(jl2);
		jf.add(jt2);
		
		jf.add(jl3);
		jf.add(jt3);
		
		jf.add(jb1);
		
		
		
		
		
		
		jf.setVisible(true);
		
	}


}

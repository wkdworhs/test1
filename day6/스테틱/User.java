package ½ºÅ×Æ½;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class User {
	
	
	public User() {
		JFrame jf = new JFrame();
		jf.setSize(500, 500);
		FlowLayout fl = new FlowLayout();
		jf.setLayout(fl);
		
		
		JLabel jl1 = new JLabel("1");
		JLabel jl2 = new JLabel("2");
		JLabel jl3 = new JLabel("3");
		
		
		JButton jb = new JButton();
		
		jf.add(jl1);
		jf.add(jl2);
		jf.add(jl3);
		jf.add(jb);
		
		
		
		
		jf.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		
		User user = new User();

	}

}

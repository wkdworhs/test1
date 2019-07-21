package Iftest;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 결과넣기그래픽 {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 255));
		
		JButton top = new JButton("\uC704\uBC84\uD2BC");
		JButton sub = new JButton("\uC544\uB798\uBC84\uD2BC");
		top.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("top을 누르셧군요");
				f.setTitle("탑을 누르셧군요");
				sub.setText("top을 누르셧군요");
			}
		});
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JButton middle = new JButton("\uAC00\uC6B4\uB370\uBC84\uD2BC");
		middle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("가운데를 누르셧군요");
				f.setTitle("가운데를 누르셧군요");
			}
		});
		f.getContentPane().add(middle, BorderLayout.CENTER);
		
		sub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("아래를 누르셧군요");
				f.setTitle("아래를 누르셧군요 ");
			}
		});
		f.getContentPane().add(sub, BorderLayout.SOUTH);
		f.setSize(500,500);
		f.setVisible(true);
		
	}

}

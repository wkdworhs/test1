package Iftest;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class 최종모먹을래 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 500);
		
		JButton btnNewButton = new JButton("\uC9DC\uC7A5");
		btnNewButton.setIcon(new ImageIcon("D:\\jjk\\day\\\uC9DC\uC7A5.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("여기 짜장이요 ");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uC9EC\uBF55");
		btnNewButton_1.setIcon(new ImageIcon("D:\\jjk\\day\\\uC9EC\uBF55.jpg"));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("여기 짬뽕이요");
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uC6B0\uB3D9");
		btnNewButton_2.setIcon(new ImageIcon("D:\\jjk\\day\\\uC6B0\uB3D9.jpg"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("여기 우동이요 ");
			}
		});
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		
		JButton btnNewButton_3 = new JButton("\uBA54\uB274\uD310 \uC785\uB2C8\uB2E4.");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("메뉴판입니다.");
			}
		});
		f.getContentPane().add(btnNewButton_3, BorderLayout.NORTH);
		f.setVisible(true);
		
		
	}

}

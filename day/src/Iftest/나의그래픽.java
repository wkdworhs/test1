package Iftest;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ���Ǳ׷��� {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� ù �׷���");
		f.setSize(500, 500);
		
		JButton btnTouchMe = new JButton("touch me");
		btnTouchMe.setFont(new Font("����", Font.PLAIN, 16));
		btnTouchMe.setBackground(Color.WHITE);
		btnTouchMe.setForeground(Color.BLACK);
		btnTouchMe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��� ��ư�� ��������");
			}
		});
		f.getContentPane().add(btnTouchMe, BorderLayout.CENTER);
		
		JButton btnFrontButton = new JButton("front button");
		btnFrontButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�����մ� ��ư�� ��������");
			}
		});
		f.getContentPane().add(btnFrontButton, BorderLayout.NORTH);
		
		JButton btnLeftButton = new JButton("left button");
		btnLeftButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnLeftButton, BorderLayout.WEST);
		
		JButton btnRightButton = new JButton("right button");
		f.getContentPane().add(btnRightButton, BorderLayout.EAST);
		
		JButton btnEndButton = new JButton("end button");
		btnEndButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(btnEndButton, BorderLayout.SOUTH);
		f.setVisible(true);
		
		

	}

}

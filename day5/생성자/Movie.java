package ������;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Movie {

	public Movie() {

		JFrame f = new JFrame("��ȭ");
		f.setSize(250, 400);
		FlowLayout flay = new FlowLayout();
		f.getContentPane().setLayout(flay);

		ImageIcon image = new ImageIcon("spider.png");

		JButton b1 = new JButton();// �̹���
		b1.setIcon(image);
		JButton b2 = new JButton("������");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon image = new ImageIcon("spider.png");
				b1.setIcon(image);
				
			}
		});
		JButton b3 = new JButton("ĸƾ");
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon image = new ImageIcon("captian.png");
				b1.setIcon(image);
				b1.setBackground(Color.blue);
			}
		});
		JButton b4 = new JButton("�˶��");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon image = new ImageIcon("aladdin.png");
				b1.setIcon(image);

				b1.setBackground(Color.pink);
			}
		});

		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(b4);

		f.setVisible(true);

	}

	public static void main(String[] args) {

		Movie movie = new Movie();

	}

}

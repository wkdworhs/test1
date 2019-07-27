package 생성자;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 나의그래픽2 {

	public 나의그래픽2() {

		JFrame f = new JFrame("나의 그래픽2");
		f.setSize(1000, 1000);
		FlowLayout fl = new FlowLayout();
		f.getContentPane().setLayout(fl);

		JButton b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("나를 눌렀군요");

			}
		});

		JButton b2 = new JButton();
		ImageIcon icon = new ImageIcon("im2.png");
		f.getContentPane().add(b1);
		b2.setIcon(icon);

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("이미지를 눌렀군요");
				ImageIcon icon = new ImageIcon("spider.png");
				b2.setIcon(icon);
			}
		});
		f.getContentPane().add(b2);

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		f.getContentPane().add(t1);
		f.getContentPane().add(t2);
		JButton push2 = new JButton("더한 결과값 확인");
		push2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = Integer.parseInt(t1.getText());
				int b = Integer.parseInt(t2.getText());
				
				int x = a+b ; 
				System.out.println(x);
				
			}
		});
		f.getContentPane().add(push2);

		JLabel result = new JLabel("결과값 출력");
		f.getContentPane().add(result);

		f.setVisible(true);

	}

	public static void main(String[] args) {
		나의그래픽2 name = new 나의그래픽2();

	}

}

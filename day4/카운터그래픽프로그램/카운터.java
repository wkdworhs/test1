package ī���ͱ׷������α׷�;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JTextField;

public class ī���� {
	static int count = 0;
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		//�����Ӻ�ǰ 1��
		 
		
		JButton result = new JButton("0");
		JFrame f = new JFrame();
		f.setTitle("���� ī���� ");
		f.setSize(500,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7901");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 25));
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC22B\uC7902");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setBackground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 25));
		f.getContentPane().add(lblNewLabel_2);
		
		t2 = new JTextField();
		f.getContentPane().add(t2);
		t2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel.setIcon(new ImageIcon("D:\\jjk\\day04\\\uCE74\uC6B4\uD130.png"));
		f.getContentPane().add(lblNewLabel);
		
		JButton b1 = new JButton("-");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("-��ư ���ÿϷ� ");
				String s1 = t1.getText();
				String s2 = t1.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				count = n1-n2 ; 
				
				result.setText(count+"");     //����� ���
			}
		});
		b1.setFont(new Font("����", Font.PLAIN, 35));
		f.getContentPane().add(b1);
		
		JButton b3 = new JButton("0");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0��ư ���ÿϷ� ");
				count=0 ; 
				result.setText(""+count+"");
			}
		});
		b3.setForeground(Color.BLACK);
		b3.setBackground(new Color(0, 255, 0));
		b3.setFont(new Font("����", Font.PLAIN, 50));
		f.getContentPane().add(b3);
		
		JButton b2 = new JButton("+");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+��ư ���ÿϷ� ");
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				count = n1+n2;
				//count++;
				result.setText(count+"");
			}
		});
		b2.setFont(new Font("����", Font.PLAIN, 35));
		f.getContentPane().add(b2);
		
		result.setFont(new Font("����", Font.PLAIN, 82));
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(result);
		
		
		//��ġ ��ǰ 1�� 
		//�� ��ǰ 2�� 
		//�̹��� ��ǰ
		//��ư��ǰ

		
		
		f.setVisible(true);
		
		
		
		

	}

}

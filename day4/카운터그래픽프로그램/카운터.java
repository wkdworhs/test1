package 카운터그래픽프로그램;

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

public class 카운터 {
	static int count = 0;
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		
		//프레임부품 1개
		 
		
		JButton result = new JButton("0");
		JFrame f = new JFrame();
		f.setTitle("나의 카운터 ");
		f.setSize(500,800);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("\uC22B\uC7901");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("\uC22B\uC7902");
		lblNewLabel_2.setForeground(new Color(128, 0, 0));
		lblNewLabel_2.setBackground(new Color(128, 0, 128));
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 25));
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
				System.out.println("-버튼 선택완료 ");
				String s1 = t1.getText();
				String s2 = t1.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				
				count = n1-n2 ; 
				
				result.setText(count+"");     //결과값 출력
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(b1);
		
		JButton b3 = new JButton("0");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("0버튼 선택완료 ");
				count=0 ; 
				result.setText(""+count+"");
			}
		});
		b3.setForeground(Color.BLACK);
		b3.setBackground(new Color(0, 255, 0));
		b3.setFont(new Font("굴림", Font.PLAIN, 50));
		f.getContentPane().add(b3);
		
		JButton b2 = new JButton("+");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("+버튼 선택완료 ");
				String s1 = t1.getText();
				String s2 = t2.getText();
				
				int n1 = Integer.parseInt(s1);
				int n2 = Integer.parseInt(s2);
				count = n1+n2;
				//count++;
				result.setText(count+"");
			}
		});
		b2.setFont(new Font("굴림", Font.PLAIN, 35));
		f.getContentPane().add(b2);
		
		result.setFont(new Font("굴림", Font.PLAIN, 82));
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		f.getContentPane().add(result);
		
		
		//배치 부품 1개 
		//라벨 부품 2개 
		//이미지 부품
		//버튼부품

		
		
		f.setVisible(true);
		
		
		
		

	}

}

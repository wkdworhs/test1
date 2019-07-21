package Iftest;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class 그래픽이미지넣기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(900, 500);
		//가위=0 바위=1 보=2
		Random r = new Random();
		
		
		JButton btnNewButton = new JButton("\uAC00\uC704");
		btnNewButton.setIcon(new ImageIcon("D:\\jjk\\day\\20643912940909444_1787233296.jpg"));
		f.getContentPane().add(btnNewButton, BorderLayout.CENTER);
		
		JButton btnNewButton_1 = new JButton("\uBC14\uC704");
		btnNewButton_1.setIcon(new ImageIcon("D:\\jjk\\day\\87307_C109_182154.jpg"));
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = r.nextInt(3);
				if(a==0) {
					System.out.println("바위를 내셨군요 이겼습니다.");
				}else if(a==1) {
					System.out.println("바위를 내셨군요 비겼습니다..");
				}else if(a==2) {
					System.out.println("바위를 내셨군요 졌습니다...");
				}
				
			}
		});
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("\uBCF4\uC790\uAE30");
		btnNewButton_2.setIcon(new ImageIcon("D:\\jjk\\day\\1186_shop1_15299880698296.jpg"));
		f.getContentPane().add(btnNewButton_2, BorderLayout.EAST);
		f.setVisible(true);
		
		
	}

}

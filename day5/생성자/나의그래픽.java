package ������;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ���Ǳ׷��� {

	public ���Ǳ׷���() {
		JFrame f = new JFrame("���� �׷���");
		f.setSize(1000, 1000);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		ImageIcon icon = new ImageIcon("im.png");
		ImageIcon icon1 = new ImageIcon("button-standby_2582kk.png");
		
		JButton b1 = new JButton(icon1);
		f.add(b1);
		JButton b2 = new JButton("��ư2");
		f.add(b2);
		JButton b3 = new JButton("��ư3");
		f.add(b3);
		JButton b4 = new JButton(icon);
		f.add(b4);
		
		
		
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		���Ǳ׷��� me = new ���Ǳ׷���();
		

	}

}

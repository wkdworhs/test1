package ������;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu {
	int count = 0 ; 

	public Menu() {
		JFrame f = new JFrame("�޴���");
		f.setSize(500, 500);
		FlowLayout fl = new FlowLayout();
		f.getContentPane().setLayout(fl);
		ImageIcon image = new ImageIcon("WkaQhd.png");
		
		JButton b4 = new JButton();
		b4.setIcon(image);
		
		int pay = 5000;
		int total = 0 ; 
		JTextField bt = new JTextField(10);
		JTextField bt2 = new JTextField(10);
		JButton b1 = new JButton();
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("«��");
				image.setDescription("WkaQhd.png");
				b4.setIcon(image);
				count++;
				bt.setText(count+"��");
				bt2.setText(count*pay+"��");
			}
		});
		b1.setText("«��");
		
		JButton b2 = new JButton();
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("¥��");
				ImageIcon image = new ImageIcon("Wkwkd.png");
				b4.setIcon(image);
				count++;
				bt.setText(count+"��");
				bt2.setText(count*pay+"��");
			}
		});
		b2.setText("¥��");
		
		JButton b3 = new JButton();
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("�쵿");
				ImageIcon image = new ImageIcon("dnehd.png");
				b4.setIcon(image);
				count++;
				bt.setText(count+"��");
				bt2.setText(count*pay+"��");
			}
		});
		b3.setText("�쵿");
		
		JLabel jl = new JLabel("���� :");
		
		
		
		JLabel jl2 = new JLabel("������ �ݾ� :");
		
		
	
		
		
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(jl);
		f.getContentPane().add(bt);
		f.getContentPane().add(b4);
		f.getContentPane().add(jl2);
		f.getContentPane().add(bt2);
		
		
		
		
		

		

		f.setVisible(true);

	}

	public static void main(String[] args) {
		Menu menu = new Menu();

	}

}

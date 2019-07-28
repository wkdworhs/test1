package 스테틱;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class DayUser {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		f.setSize(300,200);
		FlowLayout fl = new FlowLayout();
		f.setLayout(fl);
		
		Day day1 = new Day("자바공부", 10,"강남");
		Day day2 = new Day("자바수업", 5, "서부");
		Day day3 = new Day("자바복습", 3, "비엔");

		
		JLabel jl1 = new JLabel("      할일   ");
		JLabel jl2 = new JLabel("      시간   ");
		JLabel jl3 = new JLabel("      장소   ");
		
		JTextField jt1 = new JTextField(5);
		jt1.setText(day1.doing);
		JTextField jt2 = new JTextField(5);
		jt2.setText(Integer.toString(day1.time));
		JTextField jt3 = new JTextField(5);
		jt3.setText(day1.location);
		
		JButton jb1 = new JButton(" OK ");

		
		JMenuBar mb = new JMenuBar();
		JMenu jm = new JMenu();
		
		
		f.add(jm);
		f.add(jl1);
		f.add(jl2);
		f.add(jl3);
		f.add(jt1);
		f.add(jt2);
		f.add(jt3);
		f.add(mb, 6); 
		
		
		
		

		
		
		f.setVisible(true);
		
		
		
		
	}

}

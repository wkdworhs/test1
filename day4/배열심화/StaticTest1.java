package 배열심화;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class StaticTest1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "V-pos");
		
		
		
		String name = JOptionPane.showInputDialog("이름을 입력하세요");
		System.out.println("당신의 이름은 "+name + "입니다.");
		
		String input = JOptionPane.showInputDialog("나이입력");
		int age = Integer.parseInt(input);
		System.out.println("내년 나이는"+(age+1)+"입니다. ");
		
		

	}

}

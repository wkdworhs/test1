package �迭��ȭ;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class StaticTest1 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "V-pos");
		
		
		
		String name = JOptionPane.showInputDialog("�̸��� �Է��ϼ���");
		System.out.println("����� �̸��� "+name + "�Դϴ�.");
		
		String input = JOptionPane.showInputDialog("�����Է�");
		int age = Integer.parseInt(input);
		System.out.println("���� ���̴�"+(age+1)+"�Դϴ�. ");
		
		

	}

}

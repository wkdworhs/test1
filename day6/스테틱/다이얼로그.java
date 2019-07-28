package 스테틱;

import javax.swing.JOptionPane;

public class 다이얼로그 {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "난 메세지");
		
		String age = JOptionPane.showInputDialog("나이입력");
		int agei = Integer.parseInt(age);
		JOptionPane.showMessageDialog(null, "내년나이는: "+agei);
		

	}

}

package 배열심화;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class StaticTest2 {

	public static void main(String[] args) {
		
		
		
		String a = JOptionPane.showInputDialog("첫번째 수 :");
		String b = JOptionPane.showInputDialog("두번째 수 :");
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		int c = aa+bb ; 
		String cc = String.valueOf(c);
		
		JOptionPane.showMessageDialog( null,cc);
		

	}

}

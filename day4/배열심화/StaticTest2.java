package �迭��ȭ;

import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

public class StaticTest2 {

	public static void main(String[] args) {
		
		
		
		String a = JOptionPane.showInputDialog("ù��° �� :");
		String b = JOptionPane.showInputDialog("�ι�° �� :");
		
		int aa = Integer.parseInt(a);
		int bb = Integer.parseInt(b);
		
		int c = aa+bb ; 
		String cc = String.valueOf(c);
		
		JOptionPane.showMessageDialog( null,cc);
		

	}

}

package sign;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JFrame jf = new JFrame("로그인성공");
		jf.setSize(250, 300);
		
		jf.setVisible(true);
		
		
		JOptionPane jo = new JOptionPane();
		jo.showConfirmDialog(null,"로그인성공");
		

	}

}

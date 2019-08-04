package 스레드;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 자동차경주게임3 extends Frame {

	public 자동차경주게임3() {
		setTitle("자동차경주게임");
		setSize(600, 200);
		setLayout(null);

		JLabel car = new JLabel();
		ImageIcon icon = new ImageIcon("car1.gif");
		car.setIcon(icon);

		Random r = new Random();
		int x = 50;

		for (int i = 0; i < 100; i++) {
			x = x + r.nextInt(5);
			car.setBounds(x, 50, 100, 100);
//			try {
//				Thread.sleep(500);
//			} catch (Exception e) {
//				
//			}

		}

		add(car);

		setVisible(true);

	}

	public static void main(String[] args) {
		자동차경주게임3 name = new 자동차경주게임3();
	}

}

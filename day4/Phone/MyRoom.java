package Phone;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MyRoom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		JOptionPane.showConfirmDialog(null, "1.call    2.katalk");
		
		while(true) {
		System.out.println("=================");
		System.out.println("1.call" + "    2.katalk");
		System.out.println("��� �����ϼ���>> ");
		int a = sc.nextInt();
		Phone p1 = new Phone(a);

		
		}
	}

}

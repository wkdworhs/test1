package ������;

import java.util.Scanner;

public class ����ý��� {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.�۱� | 5.����");
			System.out.println("----------------------------------");
			System.out.print("���� > ");
			int input = sc.nextInt();
			
			if (input == 1) {
				Account  a = new Account();
				System.out.println("-------");
				System.out.println("1.���»���");
				System.out.println("-------");
				System.out.print("���¹�ȣ : ");
				a.no = sc.next();
				System.out.print("������ : ");
				a.name = sc.next();
				System.out.print("�ʱ��Աݾ�  : ");
				a.total = sc.nextInt();
				System.out.println(a.toString());
				System.out.println("���°� �����Ǿ����ϴ�. ");
				
				
				
				
				
				
			}
			if (input == 2) {
				System.out.println("2.���¸��");
			}
			if (input == 3) {
				System.out.println("3.����");
			}
			if (input == 4) {
				System.out.println("4.�۱�");
			}
			if (input == 5) {
				System.out.println("5.����");
				break; 
			}

		}

	}

}

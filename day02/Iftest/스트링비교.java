package Iftest;

import java.util.Scanner;

public class ��Ʈ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڿ� 2�� �Է� : ");
		String s1 = sc.next();
		String s2 = sc.next();
		
		
		if (s1.equals(s2)) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		sc.nextLine();//enter
		
		System.out.print("�λ� �¿�� �Է� : ");
		
		String life = sc.nextLine();
		System.out.println(life);
		
		
		
	}

}

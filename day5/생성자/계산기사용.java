package ������;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int b = sc.nextInt();
		System.out.print("");
		System.out.println("��� ���� (���ϱ�, ����)");
		String c  = sc.next();
		
		
		���� cal = new ����();
		if("���ϱ�".equals(c)) {
			cal.add(a,b);
		}
		
		
		

	}

}

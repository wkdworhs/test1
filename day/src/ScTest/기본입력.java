package ScTest;

import java.util.Scanner;

public class �⺻�Է� {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String name = "hi";
		String pw = "123";
		
		System.out.println("ID�� �Է��ϼ���:");
		String id = sc.next();
		System.out.println("PW�� �Է��ϼ���:");
		String pww = sc.next();
		
		
		if(name.equals(id) && pw.equals(pww)){
			System.out.println("�α��� ����");
			System.out.println(id+" ��"+" �ݰ����ϴ�");
		}else {System.out.println("�α��� ����");}
		
		//System.out.println("�Է°� : "+data);
		*/
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("--------------");
		System.out.println("--------------");

		System.out.println("ȸ������ ����");
		System.out.println("--------------");
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��� : ");
		String pw= sc.next();
		System.out.print("����ó : ");
		String number = sc.next();
		System.out.println("--------------");
		System.out.println(name+", "+id+", "+pw+", "+number);
		
		

	}

}

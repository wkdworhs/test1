package Iftest;

import java.util.Date;
import java.util.Scanner;

public class ����2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�԰� ���� ���� ���� ");
		System.out.println("1«��, 2¥��, 3�쵿");
		System.out.println("�������? ");

		int a = sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println("«���� ����������");break;
		case 2 : System.out.println("¥���� ����������");break;
		case 3 : System.out.println("�쵿�� ����������");break;
		default : System.out.println("�� �Ծ��");
		}
		
		//2 ���ش� �����Դϱ� ? 
		//���� 4�� ���� > 4�� ������ 0�̵Ǹ� ���� 
		
		Date date = new Date(); 
		int thisyear = date.getYear();
		
		if(((thisyear-2)%4)==0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		
		
		
		
		//4.        ----------------------------------
		System.out.println("�������? ");

		String aa = sc.next();
		
		
		switch(aa) {
				case "�н�" : System.out.println(aa+"������");break;
				case "�ѽ�" : System.out.println(aa+"������");break;
				case "�Ͻ�" : System.out.println(aa+"������");break;
		}
		
		

	}

}

package Iftest;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class �ֹι��� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ֹι�ȣ �Է� (-����)");
		String sh = sc.next();
		//charAt(��ġ��): String���� char 1 ���ڸ� �����Ҷ� ��� 
		
		char person = sh.charAt(6);

		switch(person) {
			case 1: System.out.println("�����Դϴ�. "); break;
			case 2:System.out.println("�����Դϴ�. "); break;
			case 3:System.out.println("�����Դϴ�. "); break;
			case 4:System.out.println("�����Դϴ�. "); break;
			default : System.out.println("�߸��Է��Ͽ����ϴ�. "); break;
				
		}
		
		//���� ------------------------------------
		System.out.println("�� �����¿� ?" );
		
		char score = 'A';
		
		
		switch(score) {
			case 'A': System.out.println("�ֿ�� �Դϴ�.");
			case 'B': System.out.println("����Դϴ�.");
			case 'C': System.out.println("�����Դϴ�.");
			default : System.out.println("������� ���߽��ϴ�. ");
				
		}
		
		

		
		
		
		
	}

}

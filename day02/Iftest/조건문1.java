package Iftest;

import java.util.Date;
import java.util.Scanner;

import org.omg.CORBA.DATA_CONVERSION;

public class ���ǹ�1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		if(hour < 11) {
			System.out.println("�¸��");
		}else if(hour >=11 && hour < 15){
			System.out.println("�¿����ʹ�");
		}else if(hour < 18) {
			System.out.println("���̺��");
		}
		
		
		//------------------------------------
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		int b = 1000;
		String won = "�� ��";
		
		for(int c = 1 ; c<10 ; c++) {
			System.out.println("�����Է� - "+c);
			System.out.println("������ǥ : " + b);
			System.out.print("�Է°� : ");
			int a = sc.nextInt();
			
			if(a >= b) {
				System.out.println("���� !! �����޼�");
				double bonus = a *0.2;
				System.out.println("����� ���ʽ��� : "+ (int)bonus+won);
			}else if(a < b){
				System.out.println("��Ÿ���׿�!! ���� �̴޼� ");
			}else {
				System.out.println("����");
			}
			System.out.println("--------------------");
		}
		

	}

}

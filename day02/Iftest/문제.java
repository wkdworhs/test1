package Iftest;

import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		//1 =--------------------
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("--------------------");
		System.out.print("������ ����� ?");
			int a = sc.nextInt() ; 
		System.out.print("���� ���� �򰡴� ?");
			String  b = sc.next();
		System.out.print("���� �Ź� ������� ?");
			double c = sc.nextDouble();
		System.out.println("--------------------");
		System.out.println("������ "+a+"��, "+"���� �򰡴� "+b+", "+"������ "+c);
		
		
		//2-----------------------
		// �μ��� �Է¹޾� ������ ���Ͽ� ������ �μ��� �����ϴ�. �ٸ��� �μ��� �ٸ��ϴ�. 
		
		System.out.print("ù��° ���� �Է� : ");
		int aa = sc.nextInt() ; 
		System.out.print("�ι�° ���� �Է� : ");
		int bb = sc.nextInt() ; 
		
		if(aa == bb) {
			System.out.println("�μ��� �����ϴ�. ");
		}else {
			System.out.println("�μ��� �ٸ��ϴ�. ");
		}
		*/
		
		
		//3-----------------------������ ��� (�ΰ��� 10%)
		double tax=0.1; 
		System.out.println("--------------------");
		System.out.print("������ : ");
		double aaa = sc.nextDouble();
		System.out.print("��ǰ�� �Ѿ� : ");
		double bbb = sc.nextDouble();
		System.out.println("�ΰ��� : "+(int)(bbb*tax));
		System.out.println("�ܵ� : "+(int)(aaa-bbb));
		System.out.println("--------------------");
		
	}

}

package �迭;

import java.util.Scanner;

public class �迭����2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] seat = new int[10];
		int count = 0 ; 
		int pay = 10000 ; 
		
		System.out.println("==============================");
		for (int i = 0; i < seat.length; i++) { // �¼���ȣ
			System.out.print("[" + (i + 1) + "]");
		}
		System.out.println("");
		
	
		

		for (int i = 0; i < seat.length; i++) {
			System.out.print("[" + seat[i] + "]");
		}
		// 5,6���ڸ� ����ó��
		// 0 > 1�� ����
		// ����ڸ���Ȳ����Ʈ
		System.out.println("");
		System.out.println("==============================");

//=====================================================

		while (true) {
			System.out.println("�¼���ȣ �Է��ϼ��� (��������� 33)");
			int data = sc.nextInt() - 1;
			
			
			if (data == 32) {
				System.out.println("���Ű� ����Ǿ����ϴ�. ");
				System.out.println("���� �ο� : "+ count+"��");
				System.out.println("1�δ� �ݾ� ���� ");
				System.out.println("�ѱݾ� ��:" +" 10.000�� "+" X  "+count+" = "+count *pay);
				break;
			}
			
			if (seat[data] == 1) {
				System.out.println("�̹̼����� �¼��Դϴ�.");
				for (int i = 0; i < seat.length; i++) {
					System.out.print("[" + i + "]");
				}
				System.out.println("");

				for (int i = 0; i < seat.length; i++) {
					System.out.print("[" + seat[i] + "]");
				}
				System.out.println("");
				System.out.println("==============================");
			
			}
			
			if (seat[data] == 0) {
				seat[data] = 1;
				count = count+1 ; 
				for (int i = 0; i < seat.length; i++) {
					System.out.print("[" + i + "]");
				}
				System.out.println("");

				for (int i = 0; i < seat.length; i++) {
					System.out.print("[" + seat[i] + "]");
				}
				System.out.println("");
				System.out.println("==============================");
			}
		}


		
		
		
		
	}

}

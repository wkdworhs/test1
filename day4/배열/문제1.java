package �迭;

import java.util.Scanner;

public class ����1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		
		String[] st = { "�л���", "�����Է�", "��������Ʈ", "�м�", "����" };
		
		
		
		
		
		
		for(int i = 0 ; i<st.length ; i++) {
			System.out.print((i+1)+"."+st[i]);
			if(i<(st.length-1)) {
				System.out.print("|");
			}
		}
		
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.print("���� > ");
		int a = sc.nextInt();
		System.out.println(st[a-1] + "�� �����ϼ˽��ϴ�.");

		if ((a-1) == 0) {
			
		}
		if ((a-1) == 1) {

		}
		if ((a-1) == 2) {

		}
		if ((a-1) == 3) {

		}
		if ((a-1) == 4) {

		}
		if ((a-1) == 5) {

		}

		int b = sc.nextInt();

		int[] aa = new int[b];

	}

}

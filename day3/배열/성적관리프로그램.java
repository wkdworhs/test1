package �迭;

import java.util.Scanner;

public class �����������α׷� {

	public static void main(String[] args) {
		// �����������α׷�
		int[] score = new int[5];

		/*
		 * int imsi ; int[] imsi2 = new int[3]; //System.out.println(imsi);
		 * System.out.println(imsi2[0]);
		 */

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.println("�����Է�");
			int data = sc.nextInt();
			score[i] = data;

		}

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);

		}

	}

}

package 배열;

import java.util.Scanner;

public class 성적관리프로그램 {

	public static void main(String[] args) {
		// 성적관리프로그램
		int[] score = new int[5];

		/*
		 * int imsi ; int[] imsi2 = new int[3]; //System.out.println(imsi);
		 * System.out.println(imsi2[0]);
		 */

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수입력");
			int data = sc.nextInt();
			score[i] = data;

		}

		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]);

		}

	}

}

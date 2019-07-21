package 배열;

import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		
		
		String[] st = { "학생수", "점수입력", "점수리스트", "분석", "종료" };
		
		
		
		
		
		
		for(int i = 0 ; i<st.length ; i++) {
			System.out.print((i+1)+"."+st[i]);
			if(i<(st.length-1)) {
				System.out.print("|");
			}
		}
		
		System.out.println("");
		System.out.println("--------------------------------------");
		System.out.print("선택 > ");
		int a = sc.nextInt();
		System.out.println(st[a-1] + "를 선택하셧습니다.");

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

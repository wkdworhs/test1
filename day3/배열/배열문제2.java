package 배열;

import java.util.Scanner;

public class 배열문제2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] seat = new int[10];
		int count = 0 ; 
		int pay = 10000 ; 
		
		System.out.println("==============================");
		for (int i = 0; i < seat.length; i++) { // 좌석번호
			System.out.print("[" + (i + 1) + "]");
		}
		System.out.println("");
		
	
		

		for (int i = 0; i < seat.length; i++) {
			System.out.print("[" + seat[i] + "]");
		}
		// 5,6번자리 예매처리
		// 0 > 1로 저장
		// 모든자리상황프린트
		System.out.println("");
		System.out.println("==============================");

//=====================================================

		while (true) {
			System.out.println("좌석번호 입력하세요 (예매종료는 33)");
			int data = sc.nextInt() - 1;
			
			
			if (data == 32) {
				System.out.println("예매가 종료되었습니다. ");
				System.out.println("예매 인원 : "+ count+"명");
				System.out.println("1인당 금액 만원 ");
				System.out.println("총금액 은:" +" 10.000원 "+" X  "+count+" = "+count *pay);
				break;
			}
			
			if (seat[data] == 1) {
				System.out.println("이미선택한 좌석입니다.");
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

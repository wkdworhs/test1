package 생성자;

import java.util.Scanner;

public class 은행시스템 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		while (true) {
			System.out.println("----------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.송금 | 5.종료");
			System.out.println("----------------------------------");
			System.out.print("선택 > ");
			int input = sc.nextInt();
			
			if (input == 1) {
				Account  a = new Account();
				System.out.println("-------");
				System.out.println("1.계좌생성");
				System.out.println("-------");
				System.out.print("계좌번호 : ");
				a.no = sc.next();
				System.out.print("계좌주 : ");
				a.name = sc.next();
				System.out.print("초기입금액  : ");
				a.total = sc.nextInt();
				System.out.println(a.toString());
				System.out.println("계좌가 생성되었습니다. ");
				
				
				
				
				
				
			}
			if (input == 2) {
				System.out.println("2.계좌목록");
			}
			if (input == 3) {
				System.out.println("3.예금");
			}
			if (input == 4) {
				System.out.println("4.송금");
			}
			if (input == 5) {
				System.out.println("5.종료");
				break; 
			}

		}

	}

}

package 생성자;

import java.util.Scanner;

public class 계산기사용 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int a = sc.nextInt();
		System.out.print("두번째 수 : ");
		int b = sc.nextInt();
		System.out.print("");
		System.out.println("기능 선택 (더하기, 빼기)");
		String c  = sc.next();
		
		
		계산기 cal = new 계산기();
		if("더하기".equals(c)) {
			cal.add(a,b);
		}
		
		
		

	}

}

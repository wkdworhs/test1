package Iftest;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		//1 =--------------------
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("--------------------");
		System.out.print("오늘의 기온은 ?");
			int a = sc.nextInt() ; 
		System.out.print("오늘 나의 평가는 ?");
			String  b = sc.next();
		System.out.print("나의 신발 사이즈는 ?");
			double c = sc.nextDouble();
		System.out.println("--------------------");
		System.out.println("오늘은 "+a+"도, "+"나의 평가는 "+b+", "+"오늘은 "+c);
		
		
		//2-----------------------
		// 두수를 입력받아 같은지 비교하여 같으면 두수가 같습니다. 다르면 두수가 다릅니다. 
		
		System.out.print("첫번째 숫자 입력 : ");
		int aa = sc.nextInt() ; 
		System.out.print("두번째 숫자 입력 : ");
		int bb = sc.nextInt() ; 
		
		if(aa == bb) {
			System.out.println("두수가 같습니다. ");
		}else {
			System.out.println("두수가 다릅니다. ");
		}
		*/
		
		
		//3-----------------------영수증 출력 (부가세 10%)
		double tax=0.1; 
		System.out.println("--------------------");
		System.out.print("받은돈 : ");
		double aaa = sc.nextDouble();
		System.out.print("상품의 총액 : ");
		double bbb = sc.nextDouble();
		System.out.println("부가세 : "+(int)(bbb*tax));
		System.out.println("잔돈 : "+(int)(aaa-bbb));
		System.out.println("--------------------");
		
	}

}

package 반복문;

import java.util.Random;
import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0 ; 
		
		
		while (true) {
			System.out.print("입력 : ");
			int data = sc.nextInt();
			if(data == 0 ) 
			{System.out.println("프로그램 종료 ");
			break;
			}
			sum = sum+data ; 
			System.out.println("누적 : "+sum);
			
		}
		System.out.println("최종 합은 : " + sum);
		
		
		
	}//main end

}//class end

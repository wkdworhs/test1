package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class ForTest5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0 ; 
		
		
		while (true) {
			System.out.print("�Է� : ");
			int data = sc.nextInt();
			if(data == 0 ) 
			{System.out.println("���α׷� ���� ");
			break;
			}
			sum = sum+data ; 
			System.out.println("���� : "+sum);
			
		}
		System.out.println("���� ���� : " + sum);
		
		
		
	}//main end

}//class end

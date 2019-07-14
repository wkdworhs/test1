package ScTest;

import java.util.Date;
import java.util.Scanner;

public class 성인판별 {
	public static void main(String[] args) {
		
		System.out.print("태어난 해 입력 >> ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Date date = new Date();
		int age = (date.getYear()+1900) - year +1 ; 
		System.out.println("당신의 나이는 "+age+"세");
			
		if(age >= 18) {
				System.out.println("성인");
		}else {
			 	System.out.println("미성인");
		}
		
		
	}//main end
}//class end 

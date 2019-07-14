package Iftest;

import java.util.Date;
import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("먹고 싶은 음식 선택 ");
		System.out.println("1짬뽕, 2짜장, 3우동");
		System.out.println("모먹을래? ");

		int a = sc.nextInt();
		
		switch(a) {
		case 1 : System.out.println("짬뽕을 먹으러가요");break;
		case 2 : System.out.println("짜장을 먹으러가요");break;
		case 3 : System.out.println("우동을 먹으러가요");break;
		default : System.out.println("안 먹어요");
		}
		
		//2 올해는 윤년입니까 ? 
		//윤년 4년 단위 > 4로 나눠서 0이되면 윤년 
		
		Date date = new Date(); 
		int thisyear = date.getYear();
		
		if(((thisyear-2)%4)==0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("윤년이 아닙니다.");
		}
		
		
		
		
		
		//4.        ----------------------------------
		System.out.println("모먹을래? ");

		String aa = sc.next();
		
		
		switch(aa) {
				case "분식" : System.out.println(aa+"먹을래");break;
				case "한식" : System.out.println(aa+"먹을래");break;
				case "일식" : System.out.println(aa+"먹을래");break;
		}
		
		

	}

}

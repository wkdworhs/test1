package Iftest;

import java.util.Scanner;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class 주민번소 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호 입력 (-제외)");
		String sh = sc.next();
		//charAt(위치값): String에서 char 1 글자를 추출할때 사용 
		
		char person = sh.charAt(6);

		switch(person) {
			case 1: System.out.println("남자입니다. "); break;
			case 2:System.out.println("여자입니다. "); break;
			case 3:System.out.println("남자입니다. "); break;
			case 4:System.out.println("여자입니다. "); break;
			default : System.out.println("잘못입력하였습니다. "); break;
				
		}
		
		//문제 ------------------------------------
		System.out.println("제 점수는요 ?" );
		
		char score = 'A';
		
		
		switch(score) {
			case 'A': System.out.println("최우수 입니다.");
			case 'B': System.out.println("우수입니다.");
			case 'C': System.out.println("보통입니다.");
			default : System.out.println("통과하지 못했습니다. ");
				
		}
		
		

		
		
		
		
	}

}

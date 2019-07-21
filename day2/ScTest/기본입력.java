package ScTest;

import java.util.Scanner;

public class 기본입력 {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		String name = "hi";
		String pw = "123";
		
		System.out.println("ID를 입력하세요:");
		String id = sc.next();
		System.out.println("PW를 입력하세요:");
		String pww = sc.next();
		
		
		if(name.equals(id) && pw.equals(pww)){
			System.out.println("로그인 성공");
			System.out.println(id+" 님"+" 반갑습니다");
		}else {System.out.println("로그인 실패");}
		
		//System.out.println("입력값 : "+data);
		*/
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("--------------");
		System.out.println("--------------");

		System.out.println("회원가입 정보");
		System.out.println("--------------");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("아이디 : ");
		String id = sc.next();
		System.out.print("비번 : ");
		String pw= sc.next();
		System.out.print("연락처 : ");
		String number = sc.next();
		System.out.println("--------------");
		System.out.println(name+", "+id+", "+pw+", "+number);
		
		

	}

}

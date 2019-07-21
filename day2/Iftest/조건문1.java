package Iftest;

import java.util.Date;
import java.util.Scanner;

import org.omg.CORBA.DATA_CONVERSION;

public class 조건문1 {

	public static void main(String[] args) {
		
		Date date = new Date();
		
		int hour = date.getHours();
		
		if(hour < 11) {
			System.out.println("굿모닝");
		}else if(hour >=11 && hour < 15){
			System.out.println("굿에프터눈");
		}else if(hour < 18) {
			System.out.println("굿이브닝");
		}
		
		
		//------------------------------------
		System.out.println("------------------");
		Scanner sc = new Scanner(System.in);
		int b = 1000;
		String won = "만 원";
		
		for(int c = 1 ; c<10 ; c++) {
			System.out.println("실적입력 - "+c);
			System.out.println("실적목표 : " + b);
			System.out.print("입력값 : ");
			int a = sc.nextInt();
			
			if(a >= b) {
				System.out.println("축하 !! 실정달성");
				double bonus = a *0.2;
				System.out.println("당신의 보너스는 : "+ (int)bonus+won);
			}else if(a < b){
				System.out.println("안타깝네요!! 실적 미달성 ");
			}else {
				System.out.println("종료");
			}
			System.out.println("--------------------");
		}
		

	}

}

package operator;

import java.util.Date;

public class date {
	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("현재시각은 : "+hour);
		
		int year = date.getYear()+1900 ; 
		int month = date.getMonth()+1 ; 
		
		System.out.println("연도"+year);
		System.out.println("월 : "+month);
		
		if(hour < 16) {
			System.out.println("집에 갈시간이 안됬네요");
		}else if(hour == 16){
			System.out.println("집에 갈시간 이네요");
		}
		
		
		
		
		
		
	}
}

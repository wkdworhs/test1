package operator;

import java.util.Calendar;
import java.util.Date;

public class test3 {
	//나이계산
	public static void main(String[] args) {
		
		int year = 1989;
		Date date = new Date();
		int thisyear= date.getYear()+1900;
		
		int age = thisyear-year+1;
		System.out.println("내나이는 : "+age);
		
	}
}

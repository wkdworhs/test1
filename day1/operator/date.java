package operator;

import java.util.Date;

public class date {
	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		System.out.println("����ð��� : "+hour);
		
		int year = date.getYear()+1900 ; 
		int month = date.getMonth()+1 ; 
		
		System.out.println("����"+year);
		System.out.println("�� : "+month);
		
		if(hour < 16) {
			System.out.println("���� ���ð��� �ȉ�׿�");
		}else if(hour == 16){
			System.out.println("���� ���ð� �̳׿�");
		}
		
		
		
		
		
		
	}
}

package ScTest;

import java.util.Date;
import java.util.Scanner;

public class �����Ǻ� {
	public static void main(String[] args) {
		
		System.out.print("�¾ �� �Է� >> ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		Date date = new Date();
		int age = (date.getYear()+1900) - year +1 ; 
		System.out.println("����� ���̴� "+age+"��");
			
		if(age >= 18) {
				System.out.println("����");
		}else {
			 	System.out.println("�̼���");
		}
		
		
	}//main end
}//class end 

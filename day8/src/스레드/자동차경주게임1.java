package 스레드;

import java.util.Random;

public class 자동차경주게임1 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int a = r.nextInt(10);
			
		

		 for (int i = 0; i < a; i++) {
			System.out.println("$");
		}
		 
		 for (int i = 0; i < 10; i++) {
				System.out.println("원");
			}
		 
		 for (int i = 0; i < 10; i++) {
			System.out.println("&");	
			}
		
	}

}

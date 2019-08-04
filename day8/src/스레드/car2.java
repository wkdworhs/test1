package 스레드;

import java.util.Random;

public class car2 extends Thread {

	@Override
	public void run() {
		String c = "<<  car 2 >>   ";
		
		Random r = new Random();
		int a = r.nextInt(50);
		
		
		for (int i = 0; i <= a; i++) {
			System.out.println(c+i);
		}
		System.out.println(c+" 쓰레드종료 "+a);

	}
	
	

}

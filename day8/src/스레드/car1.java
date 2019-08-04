package 스레드;

import java.util.Random;

public class car1 extends Thread {
	
	Random r = new Random();
	String c = "<<  car 1 >>   ";
	
	
	@Override
	public void run() {
		int a = r.nextInt(50);
		
		
		for (int i = 0; i < a; i++) {
			System.out.println(c+i);
			
		}
		System.out.println(c+" 쓰레드종료 "+a);

	}
	
	

}

package 스레드;

public class 증가 extends Thread{
	
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			
			System.out.println("++증가++  "+i);
			if(i==100) {
				System.out.println("++증가종료++");
			}
			
		}
	}

}

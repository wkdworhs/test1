package 스레드;

public class 감소 extends Thread{
	
	@Override
	public void run() {
		for (int i = 100; i >= 1; i--) {
			System.out.println("--감소--  "+i);
			if(i==1) {
				System.out.println("--감소종료--");
			}
		}
	}
}

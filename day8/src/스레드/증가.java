package ������;

public class ���� extends Thread{
	
	
	
	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			
			System.out.println("++����++  "+i);
			if(i==100) {
				System.out.println("++��������++");
			}
			
		}
	}

}

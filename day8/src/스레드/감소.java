package ������;

public class ���� extends Thread{
	
	@Override
	public void run() {
		for (int i = 100; i >= 1; i--) {
			System.out.println("--����--  "+i);
			if(i==1) {
				System.out.println("--��������--");
			}
		}
	}
}

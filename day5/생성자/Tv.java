package ������;

public class Tv {
	


	//����Ư¡=>����
	int ch;
	int volume;
	boolean onOff;
	
	public Tv() {
		
	}
	public Tv(int a, int b, boolean c) {
		ch = a ; 
		volume = b ; 
		onOff = c ; 
	}
	
	
	//����Ư¡ > �޼ҵ�� ǥ���Ѵ�. 
	public void powerOn() {
			System.out.println("Tv�� �Ѵ�.");
	}
	public String powerOff() {
			return "�˾Ҿ� ���ٲ�";
	}
	
	
	@Override//(������)
	public String toString() {
		return ch+","+volume+","+onOff ;
	}
	
	
	

}

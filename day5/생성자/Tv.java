package 생성자;

public class Tv {
	


	//정적특징=>변수
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
	
	
	//동적특징 > 메소드로 표현한다. 
	public void powerOn() {
			System.out.println("Tv를 켜다.");
	}
	public String powerOff() {
			return "알았어 꺼줄께";
	}
	
	
	@Override//(재정의)
	public String toString() {
		return ch+","+volume+","+onOff ;
	}
	
	
	

}

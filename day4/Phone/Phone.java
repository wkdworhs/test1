package Phone;

public class Phone { //클래스 정의 설명
	
	int a = 0 ; 
	
	
	public Phone(int a) {
		this.a = a ;
		if(a == 1) {
			call();
		}
		if(a == 2) {
			katalk();
		}
	}
	
	String shape ;
	int size ; 
	
	public void call() {
		System.out.println("전화하다");
	}
	public void katalk () {
		System.out.println("카톡하다");
	}
	

}

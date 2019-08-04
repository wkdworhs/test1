package 상속;

public class Car {
	
	
	String color ; 
	
	public String start() {
		return "시작합니다";
		
	}
	
	@Override
	public String toString() {
		
		return color + "\n" +start();
	}

}

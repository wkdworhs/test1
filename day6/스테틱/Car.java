package ½ºÅ×Æ½;

public class Car {
	
	int speed ; 
	static int count ; 
	
	public Car() {
		
	}
	
	public Car(int speed) {
		count++;
		this.speed = speed ; 
	}
	
	
	public void speedUp() {
		System.out.println("speedUp---!!!");
	}
	
	

}

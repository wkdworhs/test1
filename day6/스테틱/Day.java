package ½ºÅ×Æ½;

public class Day {
	
	
	String doing ; 
	int time ; 
	String location ; 
	
	public Day() {
		
	}
	
	public Day(String doing, int time, String location) {
		this.doing = doing ; 
		this.time = time ; 
		this.location = location ; 	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return doing + ", " + time + ", " + location ; 
	}
	

}

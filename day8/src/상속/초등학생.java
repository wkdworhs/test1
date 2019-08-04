package 상속;

public class 초등학생  extends 학생{
	
	public void 공부하다() {
		System.out.println("초등공부");
	}
	
	public static void main(String[] args) {
		초등학생 name = new 초등학생();
		
		name.공부하다();
		
	}

}

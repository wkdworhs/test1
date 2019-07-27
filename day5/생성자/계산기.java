package 생성자;

public class 계산기 {
	//오버로딩은 다형성이라고 한다. 
	//하나의 메소드 이름으로 매개변수를 다르게 하여
	//다른형태로 구현이 가능하다. 
	
	
	public void add() {
		System.out.println("더하기 기능");

	}

	public void add(int x, int y) {
		System.out.println("두수의 합:"+(x+y));

	}

	public void add(String x, String y) {
		System.out.println("두단어 결함 : "+x+y);
	}



}

package 생성자;

public class MyRoom2 {

	public static void main(String[] args) {
		//객세생성과 동시에 매개변수를 넣고싶을때 
		//생성자 매소ㄷ
		
		Tv tv1 = new Tv(100, 10, true);
		Tv tv2 = new Tv(100, 10, true);
		
		
		//멤버변수값을 프린트 하고싶으면, 
		//toString()메소드를 재정의 하면된다. 
		System.out.println(tv1);
		
		
		
		

	}

}

package 상속;

public class 자동차사용 extends Car  {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.color = "blue" ;
		String start = car.start();
		
		System.out.println(car);
		
		

	}

}

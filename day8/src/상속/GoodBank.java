package »ó¼Ó;

import java.io.ObjectInputStream.GetField;

public class GoodBank  extends Bank{
	
	public double getInterestRate() {

		return 3.0;
	}
	@Override
	public String toString() {
		
		return getInterestRate()+"";
	}
	
	public static void main(String[] args) {
		GoodBank name = new GoodBank();
		
		System.out.println(name.toString());
	}

}

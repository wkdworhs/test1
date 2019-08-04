package »ó¼Ó;

public class NormalBank extends Bank {
	
	public double getInterestRate() {

		return 10.0;
	}
	@Override
	public String toString() {
		return getInterestRate()+"";
	}
	
	public static void main(String[] args) {
		NormalBank name = new NormalBank();
		System.out.println(name.toString());
	}

}

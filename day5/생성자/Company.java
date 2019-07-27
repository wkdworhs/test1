package »ý¼ºÀÚ;

public class Company {
	int price ; 
	String name ; 
	public Company( ) {
		
	}
	public Company(int a) {
		price = a ; 
	}
	
	public Company(int a, String b ) {
		price = a ; 
		name = b;
	}
	
	@Override
	public String toString() {
		return price+", "+name + ".";
	}

}

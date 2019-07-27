package 생성자;

public class Account {
	
	String no ; //계좌번호
	String name ; //계좌주
	int total ; //총금액 
	


	@Override
	public String toString() {
		return no + ", "+ name + ", " + total ; 
	}
	
	public static void main(String[] args) {
		

	}

}

package Phone;

public class Phone { //Ŭ���� ���� ����
	
	int a = 0 ; 
	
	
	public Phone(int a) {
		this.a = a ;
		if(a == 1) {
			call();
		}
		if(a == 2) {
			katalk();
		}
	}
	
	String shape ;
	int size ; 
	
	public void call() {
		System.out.println("��ȭ�ϴ�");
	}
	public void katalk () {
		System.out.println("ī���ϴ�");
	}
	

}

package �迭;

import java.util.Scanner;

public class �迭����1 {

	public static void main(String[] args) {
		// 1.�Է°��� �޾Ƽ� 5���� ������ �ִ´� 
		//2. 3��° �л��� 0��ó���Ѵ�. 
		//3 ���� ����Ʈ 
		
		int[] jum = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i<jum.length ; i++) {
				System.out.println((i+1)+" �� �л� �����Է� : ");
				int data = sc.nextInt();
				jum[i] = data ; 
				System.out.println("����(1) / �ƴ�(2) ?");
				String data2 = sc.next();
				if(data2.equals("1")) {
					System.out.println("�����Դϴ�");
				}else if(data2.equals("2")){
					System.out.println("�������Դϴ�. ");
					jum[i] = 0 ; 
				}
				
				
		}
		
		
		for(int i = 0 ; i<jum.length ; i++) {
			System.out.println(jum[i]); 
		}
		
	
	
		
		
		

	}

}

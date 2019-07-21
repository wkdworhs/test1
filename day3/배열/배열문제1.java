package 배열;

import java.util.Scanner;

public class 배열문제1 {

	public static void main(String[] args) {
		// 1.입력값을 받아서 5개의 점수를 넣는다 
		//2. 3번째 학생은 0점처리한다. 
		//3 점수 리스트 
		
		int[] jum = new int[5];
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0 ; i<jum.length ; i++) {
				System.out.println((i+1)+" 번 학생 점수입력 : ");
				int data = sc.nextInt();
				jum[i] = data ; 
				System.out.println("성실(1) / 컷닝(2) ?");
				String data2 = sc.next();
				if(data2.equals("1")) {
					System.out.println("정상입니다");
				}else if(data2.equals("2")){
					System.out.println("비정상입니다. ");
					jum[i] = 0 ; 
				}
				
				
		}
		
		
		for(int i = 0 ; i<jum.length ; i++) {
			System.out.println(jum[i]); 
		}
		
	
	
		
		
		

	}

}

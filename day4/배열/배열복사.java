package �迭;

import java.lang.reflect.Array;
import java.util.Arrays;

public class �迭���� {

	public static void main(String[] args) {
		
		//���� ����
		int n1 = 100;
		int n2 = n1 ; 
		System.out.println(n1);
		System.out.println(n2);
		n1 = 200 ; 
		System.out.println(n1);
		System.out.println(n2);
		//--------------------------------------
		
		
		//�迭�� ���� ��������
		System.out.println("=============");
		int[] n3 = {1,2};
		int[] n4 = n3 ; 
		
		for(int x : n3) {
			System.out.println(x);
		}
		for(int x : n4) {
			System.out.println(x);
		}

		System.out.println("=============");
		n3[0]= 99;
		
		for(int x : n3) {
			System.out.println(x);
		}
		for(int x : n4) {
			System.out.println(x);
		}
		//--------------------------------------
		
		// �迭�� ���� 2 ���� ���� 
		System.out.println("=============");
		
		int[] n5 = {1,2};
		int[] n6 = n3 ; 
		
		for(int x : n5) {
			System.out.println(x);
		}
		for(int x : n6) {
			System.out.println(x);
		}

		System.out.println("=============");
		n3[0]= 99;
		
		for(int x : n5) {
			System.out.println(x);
		}
		for(int x : n6) {
			System.out.println(x);
		}
		
		//--------------------------------------
		//����
		
		System.out.println("=============");
		
		int[] n7 = {11,22,33,44,55,66};
		int[] n8 = new int[6];
		Arrays.sort(n8);
		System.out.println();
		for ( int i : n7) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

package ¹Ýº¹¹®;

import java.util.Random;

import javax.xml.ws.FaultAction;

public class LottoTest {

	public static void main(String[] args) {
		int[] a=new int[6] ;
		Random r = new Random();
		boolean b = true;
		
		for(int i = 0 ; i<a.length; i++ ) {
			a[i] = r.nextInt(10)+1;
			
		}

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);

		while (b) {
			for(int i=0 ; i<6  ;i++ ) {
				
				for(int c=i+1 ; c<6; c++ ) {
					if(a[i] != a[c]) {
						continue;
					}else {
						a[c] = r.nextInt(10) + 1;
						
					
					}
				}
			}
			b=false;
		}
		System.out.println("=============");
			
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);	
				


	}//method end

}// class end

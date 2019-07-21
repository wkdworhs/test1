package ¹Ýº¹¹®;

import java.util.Random;

public class ForTest2 {

	public static void main(String[] args) {

		Random r = new Random();

		int f = 0;

		int a[] = { 0, 0, 0, 0, 0, 0 };

		while (true) {

			a[0] = r.nextInt(45) + 1;
			a[1] = r.nextInt(45) + 1;
			a[2] = r.nextInt(45) + 1;
			a[3] = r.nextInt(45) + 1;
			a[4] = r.nextInt(45) + 1;
			a[5] = r.nextInt(45) + 1;

			for (int i = 0; i < 6; i++) {
				if (a[i] != a[i + 1]) {
					continue;
				}else if(a[i] == a[i + 1]){
					a[i] = r.nextInt(45) + 1;
					a[i+1] = r.nextInt(45) + 1;
					
				}

			}

		}
		/*
		 * for (int i = 0; i <= 100; i++) { if (a[i] > a[i + 1]) { f = a[i]; a[i] = a[i
		 * + 1]; a[i + 1] = f; }
		 * 
		 * }
		 * 
		 * for (int i = 0; i < 6; i++) { System.out.println(a[i]); }
		 */

	}// main end

}// class end

package 반복문;

import java.util.Random;
import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int result = 0;
		int target = r.nextInt(10) + 1;
		int error = 0;

		while (true) {
			System.out.println("숫자를 입력하세요");
			result = sc.nextInt();
			if (result == target) {
				System.out.println("축하합니다 정답입니다. ");
				System.out.println("입장하세요");
				break;
			} else {
				error++;

				System.out.println("에러횟수 : " + error);
				System.out.println("정답이 아닙니다. 다시입력하세요");
				if (result < target) {
					System.out.println("너무 작습니다. ");
				} else if (result > target) {
					System.out.println("너무 큽니다. ");
				}

			}

			if (error == 5) {
				System.out.println("입력횟수 초과.");
				System.out.println("프로그램 종료 ");
				break;

			}
		}

	}// main end
}// class end

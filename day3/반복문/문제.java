package �ݺ���;

import java.util.Random;
import java.util.Scanner;

public class ���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();

		int result = 0;
		int target = r.nextInt(10) + 1;
		int error = 0;

		while (true) {
			System.out.println("���ڸ� �Է��ϼ���");
			result = sc.nextInt();
			if (result == target) {
				System.out.println("�����մϴ� �����Դϴ�. ");
				System.out.println("�����ϼ���");
				break;
			} else {
				error++;

				System.out.println("����Ƚ�� : " + error);
				System.out.println("������ �ƴմϴ�. �ٽ��Է��ϼ���");
				if (result < target) {
					System.out.println("�ʹ� �۽��ϴ�. ");
				} else if (result > target) {
					System.out.println("�ʹ� Ů�ϴ�. ");
				}

			}

			if (error == 5) {
				System.out.println("�Է�Ƚ�� �ʰ�.");
				System.out.println("���α׷� ���� ");
				break;

			}
		}

	}// main end
}// class end

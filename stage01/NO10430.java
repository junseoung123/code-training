package stage01;

import java.util.Scanner;

public class NO10430 {

	public static void main(String[] args) {
		// ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
        // ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
		
		int a;
		int b;
		int b1;
		int b00;
	    int b2;
		int b3;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		b1 = b/100;
		b00 = b - (b1 * 100);
		b2 = b00/10;
		b3 = b - (b1 * 100) - ( b2 * 10);
		
		System.out.println( a * b3);
		System.out.println( a * b2);
		System.out.println( a * b1);
		System.out.println( a* b);
	}

}

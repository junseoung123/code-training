package stage01;

import java.util.Scanner;

public class NO10869 {

	public static void main(String[] args) {
		// ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
		//ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.

		int A;
		int B;
		int C;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		System.out.println( (A+B)%C );
		System.out.println( ((A%C) + (B%C))%C );
		System.out.println( (A*B)%C );
		System.out.println( ((A%C) * (B%C))%C );
		
	}

}

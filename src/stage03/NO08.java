package stage03;

import java.util.Scanner;

public class NO08 {

	public static void main(String[] args) {
		// ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		// �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		
		// �� �׽�Ʈ ���̽����� "Case #x: A + B = C" �������� ����Ѵ�. x�� �׽�Ʈ ���̽� ��ȣ�̰� 1���� �����ϸ�, C�� A+B�̴�.
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=1; i<=T; i++) {
			
			int A = sc.nextInt();
			int B = sc.nextInt();
			int C = A+B;
			
			System.out.println( "Case #" + i + ": " + A + " + " + B + " = " + C);
					
			
		}
		
		

	}

}

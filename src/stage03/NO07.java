package stage03;

import java.util.Scanner;

public class NO07 {

	public static void main(String[] args) {
		// ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.
		//�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)
		
		//�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			
			System.out.println("Case #" + i + ": "+ (A+B));
			
		}
		

	}

}

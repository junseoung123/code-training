package stage03;

import java.util.Scanner;

public class NO13 {

	public static void main(String[] args) {
		// �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		
		while( true ) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A==0 && B==0) break;
			
			
			System.out.println((A+B));
		}

	}

}

package stage03;

import java.util.Scanner;

public class NO11 {

	public static void main(String[] args) {
		// ù° �ٿ� N�� X�� �־�����. (1 �� N, X �� 10,000)
		// ��° �ٿ� ���� A�� �̷�� ���� N���� �־�����. �־����� ������ ��� 1���� ũ�ų� ����, 10,000���� �۰ų� ���� �����̴�.
		
		// X���� ���� ���� �Է¹��� ������� �������� ������ ����Ѵ�. X���� ���� ���� ��� �ϳ� �����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int nn = sc.nextInt();
			
			if(nn<X) System.out.print(nn + " ");
			
		}
	}
}

	



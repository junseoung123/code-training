package stage03;

import java.util.Scanner;

public class NO01 {

	public static void main(String[] args) {
		// ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
		
		//������İ� ���� N*1���� N*9���� ����Ѵ�.
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if( n>=1 && n<=9 ) {
			for(int i=1; i<10; i++) {
				System.out.println(n + "*" + i + "=" + n*i );
			}
		}

	}

}

package stage03;

import java.util.Scanner;

public class NO09 {

	public static void main(String[] args) {
		//ù° �ٿ� N(1 �� N �� 100)�� �־�����.
		
		//ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String star = "*";
		
		for (int i=1; i<=N; i++) {
		    
			
			
			System.out.println(star);
			star += "*";
		}


	}

}

package stage03;

import java.util.Scanner;

public class NO10 {

	public static void main(String[] args) {
		// ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����
		// ������, �������� �������� ������ ��(���� ����)�� ����Ͻÿ�.
		
		// ù° �ٿ� N(1 �� N �� 100)�� �־�����.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		
		for(int i=0; i<N; i++) { 
			for(int j=0; j<N; j++) {
				if(i == j) {
					for(int k=1; k<=N-i; k++) {
						System.out.print(" ");
					}
					for(int l=1; l<=j+1; l++) {
						System.out.print("*");
					}
				}
				
			}
			System.out.println();
			
		}

	}

}

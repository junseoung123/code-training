package stage11;

import java.util.Scanner;

public class NO10872 {

	public static void main(String[] args) {
		//���
		//10872
		//0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int sum = 1;
		
		while(N != 0) {
			sum = sum*N;
			
			N--;
		}
		System.out.println(sum);

	}

}

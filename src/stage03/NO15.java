package stage03;

import java.util.Scanner;

public class NO15 {

	public static void main(String[] args) {
		// 26���� �����Ѵ�. 2+6 = 8�̴�. ���ο� ���� 68�̴�. 6+8 = 14�̴�. ���ο� ���� 84�̴�. 8+4 = 12��
		// ��. ���ο� ���� 42�̴�. 4+2 = 6�̴�. ���ο� ���� 26�̴�.
		// ���� ���� 4������ ���� ���� ���ƿ� �� �ִ�. ���� 26�� ����Ŭ�� ���̴� 4�̴�.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		int copy = N;
		int cnt = 0;
		
		while(true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			cnt++;
			
			if(copy == N) {
				break;
			}
		}
		System.out.println(cnt);
		
		
		
		

	}

}

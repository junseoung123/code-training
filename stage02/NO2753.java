package stage02;

import java.util.Scanner;

public class NO2753 {

	public static void main(String[] args) {
		// ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
		// ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		if(x%4 == 0 && x%100 !=0 || x%400 == 0) {
			System.out.println("1");
			
		}
		else {
			System.out.println("0");
		}

	}

}

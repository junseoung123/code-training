package day02;

import java.util.Scanner;

public class NO01 {
	public static void main(String[] args) {
		// �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
		
		int A;
		int B;
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt(); 
		B = sc.nextInt();
		
		if(A>B) {
			System.out.println(">");
		}
		else if(A<B ) {
			System.out.println("<");
		}
		else {
			System.out.println("==");
		}
		

	}

}

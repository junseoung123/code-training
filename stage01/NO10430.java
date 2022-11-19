package stage01;

import java.util.Scanner;

public class NO10430 {

	public static void main(String[] args) {
		// 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
        // 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		
		int a;
		int b;
		int b1;
		int b00;
	    int b2;
		int b3;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		b1 = b/100;
		b00 = b - (b1 * 100);
		b2 = b00/10;
		b3 = b - (b1 * 100) - ( b2 * 10);
		
		System.out.println( a * b3);
		System.out.println( a * b2);
		System.out.println( a * b1);
		System.out.println( a* b);
	}

}

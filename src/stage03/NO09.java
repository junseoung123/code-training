package stage03;

import java.util.Scanner;

public class NO09 {

	public static void main(String[] args) {
		//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		
		//첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String star = "*";
		
		for (int i=1; i<=N; i++) {
		    
			
			
			System.out.println(star);
			star += "*";
		}


	}

}

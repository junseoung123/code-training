package stage03;

import java.util.Scanner;

public class NO07 {

	public static void main(String[] args) {
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		//각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		
		
		for(int i=1; i<=T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			
			System.out.println("Case #" + i + ": "+ (A+B));
			
		}
		

	}

}

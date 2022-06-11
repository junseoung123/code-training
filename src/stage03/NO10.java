package stage03;

import java.util.Scanner;

public class NO10 {

	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		
		// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		
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

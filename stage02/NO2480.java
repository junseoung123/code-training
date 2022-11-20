package stage02;

import java.util.Scanner;

public class NO2480 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (A!=B && B!=C && C!=A) {
			int max;
			
			if(A>B) {
				if(C>A) {
					max = C;
				}
				else {
					max = A;
				}
			} else {
				if (C>B) {
					max = C;
				} else {
					max = B;
				}
			}
			System.out.println(max*100);
			
		} else {
			// 3개의 변수가 모두 같은 경우
			if (A == B && A == C) {
				System.out.println(10000 + A * 1000);
			}
			else {
				// a가 b혹은 c랑만 같은 경우
				if(A == B || A == C) {
					System.out.println(1000 + A * 100);
				}
				// b가 c랑 같은 경우
				else {
					System.out.println(1000 + B * 100);
				}
			}
		}
				

	}

}

package stage02;

import java.util.Scanner;

public class NO1330 {

	public static void main(String[] args) {
		// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		//첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
		
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

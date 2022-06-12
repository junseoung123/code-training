package stage03;

import java.util.Scanner;

public class NO14 {

	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println(A+B);
		}
		sc.close();

	}

}

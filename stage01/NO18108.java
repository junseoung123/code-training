package stage01;

import java.util.Scanner;

public class NO18108 {

	public static void main(String[] args) {
		// 서기 연도를 알아보고 싶은 불기 연도 y가 주어진다. (1000 ≤ y ≤ 3000)
		//불기 연도를 서기 연도로 변환한 결과를 출력한다.
		
		int y;
		Scanner sc = new Scanner(System.in);
		
		y = sc.nextInt();
		System.out.println( y - 543);

	}

}

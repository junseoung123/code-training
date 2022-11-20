package stage02;

import java.util.Scanner;

public class NO2753 {

	public static void main(String[] args) {
		// 첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
		// 첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
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

package day02;

import java.util.Scanner;

public class NO02 {

	public static void main(String[] args) {
		// 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		// 시험 성적을 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if (a<=100 && a>=90) {
			System.out.println("A");
			
		}
		else if (a<90 && a>=80) {
			System.out.println("B");
		}
		else if (a<80 && a>=70) {
			System.out.println("C");
        }
		else if (a<70 && a>=60) {
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}

}
}

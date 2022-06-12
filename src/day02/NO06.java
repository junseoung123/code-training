package day02;

import java.util.Scanner;

public class NO06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		if (B+C>=60) {
			A+=(B+C)%60;
		}
				

	}

}

package stage05;

import java.util.Scanner;

public class NO01 {

	public static void main(String[] args) {
		// 15596
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long[] a = new long[n];
		long sum = 0;
		
		for(int i=0; i<a.length; i++) {
			a[i] = sc.nextInt();
			
		}
		for(int i=0; i<a.length; i++) {
			sum += a[i];
			
		}
		
		System.out.println(sum);

	}

}

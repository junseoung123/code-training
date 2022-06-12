package stage03;

import java.util.Scanner;

public class NO03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int T = 0;
		
		for(int i = 1; i<=n; i++) {
			
			T+=i;
			
		}
		System.out.println(T);

	}

}

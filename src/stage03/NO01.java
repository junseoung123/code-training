package stage03;

import java.util.Scanner;

public class NO01 {

	public static void main(String[] args) {
		// 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		
		//출력형식과 같게 N*1부터 N*9까지 출력한다.
		int n;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if( n>=1 && n<=9 ) {
			for(int i=1; i<10; i++) {
				System.out.println(n + "*" + i + "=" + n*i );
			}
		}

	}

}

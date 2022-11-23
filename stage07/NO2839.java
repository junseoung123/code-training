package stage07;

import java.util.Scanner;

public class NO2839 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int t = 0;
		
		while(true) {
			if(N%5==0) {
				t += N/5;
				System.out.println(t);
				break;
			}
			else {
			N-=3;
			t++;
				
			}
			if(N<0) {
				System.out.println(-1);
				break;
			}
		}
	}
	}




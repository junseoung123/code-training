package stage07;
import java.util.Scanner;

public class NO10250 {

	public static void main(String[] args) {
		//10250
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
			int H = sc.nextInt();  //6
			int W = sc.nextInt();  //12
			int N = sc.nextInt();  //10
			
			if(N % H == 0) {
				System.out.println((H * 100) + (N / H));
 
			} else {
				System.out.println(((N % H) * 100) + ((N / H) + 1));
			}
			
			
		}

	}

}

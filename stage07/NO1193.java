package stage07;

import java.util.Scanner;

public class NO1193 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		
		int n=0; // ��
		int top=1;
		int bot=1;
		int cnt=0; // ����
		if(X==1) {
			System.out.println("1/1");
		}else {
			while(cnt<X){
				n++;
				cnt=n*(n+1)/2; //��� ° ������ ã�� �ڵ�
			}
			
			int num=X-(n-1)*n/2;  //���� ��� ° ������ ã�� �ڵ�
			
			if(n%2==0) {  //¦�� ���� �� 
				top=num;
				bot=n-num+1;
			}else {
				top=n-num+1;
				bot=num;
			}
			System.out.println(top+"/"+bot);
		}
		

	}

}
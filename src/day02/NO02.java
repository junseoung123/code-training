package day02;

import java.util.Scanner;

public class NO02 {

	public static void main(String[] args) {
		// ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
		// ���� ������ ����Ѵ�.
		
		
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

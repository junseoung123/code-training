package stage11;
import java.util.Scanner;
public class NO11729 {

	static StringBuilder sb = new StringBuilder();
	static int count = 0;

	// from : ����� 
	// to: ������   
	// other: �Ѵ� �ƴ� ��
	public static void hanoi(int n, int from, int to, int other) {
		if (n == 0)
			return;
		else {
			count++;
			hanoi(n - 1, from, other, to);
			//1. ��� ����ó�� 3���� ž�� �ִٸ�, 2���� ž�� �������� �ƴѰ����� �Ű� ����
			sb.append(from + " " + to + "\n");
			//2. ������ ���� ž�� �������� �ű�.
			hanoi(n - 1, other, to, from);
			//3. �������� �ƴ� �� �� �Űܳ��Ҵ� ž���� �������� �ű�
		
		
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		hanoi(n, 1, 3, 2);

		System.out.println(count);
		System.out.println(sb);

	}

}

package stage02;

import java.util.Scanner;

public class NO2884 {

	public static void main(String[] args) {
		// ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
        //�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
		
		//ù° �ٿ� ����̰� â������ ����� ����� ��, �����ؾ� �ϴ� �˶� �ð��� ����Ѵ�. (�Է°� ���� ���·� ����ϸ� �ȴ�.)
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int C = sc.nextInt();
        
        int min = 60*A + B;
        min += C;
        
        int hour = (min/60)%24;
        int minute = min%60;
        
        System.out.println(hour + " " + minute);
        
       
        //���Դ� 2ź! �� �̰� ���� �����̶��? �˼� ���� �ѱ� ��Ƽ��Ʈ ����
        
	}

}

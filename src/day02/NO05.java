package day02;

import java.util.Scanner;

public class NO05 {

	public static void main(String[] args) {
		// ù° �ٿ� �� ���� H�� M�� �־�����. (0 �� H �� 23, 0 �� M �� 59) �׸��� �̰��� ���� ����̰� ������ ���� �˶� �ð� H�� M���� �ǹ��Ѵ�.
        //�Է� �ð��� 24�ð� ǥ���� ����Ѵ�. 24�ð� ǥ������ �Ϸ��� ������ 0:0(����)�̰�, ���� 23:59(������ ���� 1�� ��)�̴�. �ð��� ��Ÿ�� ��, ���ʿ��� 0�� ������� �ʴ´�.
		
		//ù° �ٿ� ����̰� â������ ����� ����� ��, �����ؾ� �ϴ� �˶� �ð��� ����Ѵ�. (�Է°� ���� ���·� ����ϸ� �ȴ�.)
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt();
        int M = sc.nextInt();
        
        /*if ( M<45) {
        	if (H==0) {
        	int NM = 60 + (M-45);
        	
        	System.out.println( 23 + " " + NM);
        	
        	} else {
            int NM = 60 + (M-45);
        	
        	System.out.println( H-1 + " " + NM);
        	}
        	

        }
        else {
        	int NM = M-45;
        	System.out.println( H + " " + NM);
        	
        }*/
        
        if(H>=0 && H<=23 && M>=0 && M<=59) {
        	M = M-45;
        	if (M<0) {
        		H=H-1;
        			if(H<0) {
        				H=24+H;
        			}
        			M=60+M;
        		}
        	 System.out.println(H + " " +  M);
        	}
       
  
        
	}

}

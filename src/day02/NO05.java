package day02;

import java.util.Scanner;

public class NO05 {

	public static void main(String[] args) {
		// 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
        //입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		
		//첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
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

package stage02;

import java.util.Scanner;

public class NO2884 {

	public static void main(String[] args) {
		// 첫째 줄에 두 정수 H와 M이 주어진다. (0 ≤ H ≤ 23, 0 ≤ M ≤ 59) 그리고 이것은 현재 상근이가 설정한 놓은 알람 시간 H시 M분을 의미한다.
        //입력 시간은 24시간 표현을 사용한다. 24시간 표현에서 하루의 시작은 0:0(자정)이고, 끝은 23:59(다음날 자정 1분 전)이다. 시간을 나타낼 때, 불필요한 0은 사용하지 않는다.
		
		//첫째 줄에 상근이가 창영이의 방법을 사용할 때, 설정해야 하는 알람 시간을 출력한다. (입력과 같은 형태로 출력하면 된다.)
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int C = sc.nextInt();
        
        int min = 60*A + B;
        min += C;
        
        int hour = (min/60)%24;
        int minute = min%60;
        
        System.out.println(hour + " " + minute);
        
       
        //나왔다 2탄! 와 이게 국내 음악이라고? 팝송 같은 한국 아티스트 음악
        
	}

}

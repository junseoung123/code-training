package stage07;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        long a = sc.nextInt(); 
        long b = sc.nextInt(); 
        long c = sc.nextInt(); 

        long count = 0;

        
        if (c - b > 0) {
//            while (true) {
//                count = count + 1;
//                if (c * count > a + b * count) {
//                    System.out.println(count);
//                    break;
//                }
//            }
           
            count = a / (c - b) + 1;
            System.out.println(count);
        } else {
            count = -1;
            System.out.println(count);
        }


    }

}
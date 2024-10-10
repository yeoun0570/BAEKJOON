package GoSchool;

import java.util.Scanner;

public class Q16283_Farm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); //양 한마리 소비 사료량
        int b = sc.nextInt(); //염소 한마리 소비 사료량
        int n = sc.nextInt(); //총 양과 염소 개수
        int w = sc.nextInt(); //전체 소비 사료량

        int count = 0;

        for (int i = 1; i <= 1000; i++) {
            for (int j = 1; j <= 1000; j++) {
                if (w == a * i + b * j && n == i + j) {
                    System.out.println(i + " " + j);
                    count++;
                    break;
                }
            }
        }
        if(count == 0 || count >= 2) {
            System.out.println(-1);
        }
    }
}

package Class1;

import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 1;
        int b = 1;

        while(b != 0) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (b != 0) {
                System.out.println(a + b);
            }
        }
    }
}

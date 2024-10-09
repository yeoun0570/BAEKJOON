package GoSchool;

import java.util.Scanner;

public class Q17945_GodOfGoToSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = -1000; i <= 1000; i++) {
            if (i * i + 2 * a * i + b == 0){
                System.out.println(i);
            };
        }


    }
}

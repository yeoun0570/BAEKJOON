package Class1;

import java.util.Scanner;

public class Q10871 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int X = sc.nextInt();

        for(int i = 1; i<=N; i++) {
            int A = sc.nextInt();
            if (A < X) {
                System.out.print(A + " ");
            }
        }

    }
}

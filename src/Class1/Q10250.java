package Class1;


import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int h = 0;
        int w = 0;
        int n = 0;
        int count = 0;

        for (int k = 1; k <= t; k++) {
            h = sc.nextInt();
            w = sc.nextInt();
            n = sc.nextInt();


            String[] arr = new String[h * w];

            for (int i = 1; i <= w; i++) {
                for (int j = 1; j <= h; j++) {
                    if (i < 10) {
                        arr[count] = String.valueOf(j) + "0" + String.valueOf(i);
                    } else {
                        arr[count] = String.valueOf(j) + String.valueOf(i);
                    }
                    count++;
                }
            }
            System.out.println(arr[n - 1]);
            count = 0;
        }

    }
}

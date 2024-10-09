package GoSchool;

import java.util.Scanner;

public class Q2851_SuperMario {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int a = 0;
        int b = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }






        for (int i = 0; i < arr.length; i++) {
            a += arr[i];

            for (int j = 0; j <= i - 1; j++) {
                b += arr[j];
            }

            if (a >= 100) {
                break;
            }

            b = 0;
        }


        if (a == 100 || b == 100) {
            System.out.println(a);
        } else if (Math.abs(100 - a) == Math.abs(100 - b)) {
            if(a >= b) {
                System.out.println(a);
            } else {
                System.out.println(b);
            }
        } else if (Math.abs(100 - a) >= Math.abs(100 - b)){
            System.out.println(b);
        } else {
            System.out.println(a);
        }

    }
}

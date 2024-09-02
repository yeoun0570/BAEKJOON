package Class1;

import java.util.Scanner;

public class Q3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int count = 0;
        boolean bl = false;

        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = n % 42;
        }

        for (int i = 0; i < 10; i++) {
            bl = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    bl = true;
                    break;
                }
            }
            if (bl == false){
                count++;
            }
        }
        System.out.println(count);

    }
}

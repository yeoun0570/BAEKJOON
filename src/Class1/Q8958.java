package Class1;

import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        String str = "";

        for (int i = 0; i < n; i++) {
            str = sc.next();
            String[] strArr = new String[str.length()];

            for (int j = 0; j < strArr.length; j++) {
                strArr[j] = String.valueOf(str.charAt(j));

                if (strArr[j].equals("O")) {
                    count++;
                    sum += count;
                } else {
                    count = 0;
                }
            }
            System.out.println(sum);
            sum = 0;
            count = 0;
        }


    }
}

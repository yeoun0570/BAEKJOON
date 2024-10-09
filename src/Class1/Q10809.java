package Class1;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int count = 0;
        int n = 0;
        String[] sArr = new String[s.length()];
        String[] strArr = new String[26];

        for (int i = 0 ; i < s.length(); i++) {
            sArr[i] = String.valueOf(s.charAt(i));

            for (char ch = 'a'; ch <= 'z'; ch++) {

                strArr[count] = String.valueOf(ch);

                if(strArr[count].equals(sArr[i])) {
                    System.out.print(i + " ");
                }
                count++;
            }
            count = 0;
        }









    }
}

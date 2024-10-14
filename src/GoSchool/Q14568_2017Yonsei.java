package GoSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q14568_2017Yonsei {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int a = 3; a < n; a++) {
            for (int b = 1; b < n; b++) {
                int c = n - a - b;
                if (a >= b + 2 && c % 2 == 0 && c > 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

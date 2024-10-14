package GoSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1977_PerfectSquare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        int minus = -1;

        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            double x = Math.pow(i,2);
            if(x >= m && x <= n){
                sum += (int)x;
                min = Math.min(min, (int)x);
            }
        }

        if(sum > 0) {
            System.out.println(sum);
            System.out.println(min);
        } else {
            System.out.println(minus);
        }
    }
}

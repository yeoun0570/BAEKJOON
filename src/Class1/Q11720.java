package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        int[] arr = new int[a];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = b.charAt(i) - '0';
            sum += arr[i];
        }
        System.out.println(sum);
    }
}

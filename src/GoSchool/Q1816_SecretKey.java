package GoSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1816_SecretKey {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());  // 입력받을 숫자의 개수
        Long[] arr = new Long[n];

        // 숫자 배열 입력
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(br.readLine());
        }

        // 각 숫자에 대해 처리
        for (Long num : arr) {
            if (isPrimeKey(num)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // 숫자가 100만 이하의 소수로 나누어지지 않으면 true 반환
    public static boolean isPrimeKey(Long num) {
        if (num <= 1000000) {
            return false;  // 100만 이하의 수는 소수가 아니므로 바로 NO
        }

        // 2부터 100만까지 나누어지는지 확인하고 나누어지면 false
        for (int i = 2; i <= 1000000; i++) {
            if (num % i == 0) {
                return false;  // 100만 이하의 수로 나누어지면 NO
            }
        }

        return true;  // 100만 이하의 소수로 나누어지지 않으면 YES
    }
}


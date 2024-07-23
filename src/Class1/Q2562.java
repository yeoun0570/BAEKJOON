package Class1;

import static java.lang.Integer.MIN_VALUE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2562 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int[] number = new int[9];
    int no = 0;
    int max = MIN_VALUE;

    for (int i = 0; i < number.length; i++) {
      number[i] = Integer.parseInt(br.readLine());
      max = Math.max(max, number[i]);
    }
    System.out.println(max);
    for (int i = 0; i < number.length; i++) {
      if (number[i] == max) {
        System.out.println(i + 1);
      }
    }

  }

}

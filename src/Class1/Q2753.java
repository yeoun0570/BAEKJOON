package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2753 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int year = Integer.parseInt(br.readLine());

    if (1 <= year && year <= 4000) {

      if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
        System.out.println(1);
      } else {
        System.out.println(0);
      }
    }

  }
}

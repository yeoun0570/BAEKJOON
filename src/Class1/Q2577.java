package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q2577 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    List<Integer> arr = new ArrayList<>();

    int A = Integer.parseInt(br.readLine());
    int B = Integer.parseInt(br.readLine());
    int C = Integer.parseInt(br.readLine());
    int multiply = 0;
    int count = 0;

    if ((A >= 100 && A < 1000) && (B >= 100 && B < 1000) && (C >= 100 && C < 1000)) {
      multiply = A * B * C;
    }

    String str = String.valueOf(multiply);

    for (int i = 0; i < str.length(); i++){
      arr.add(str.charAt(i) - 48);
    }


    for(int i = 0; i < 10; i++) {
      count = 0;
      for(int j = 0; j < str.length(); j++){
        if (arr.get(j) == i) {
          count++;
        }
      }
      System.out.println(count);
    }

  }
}

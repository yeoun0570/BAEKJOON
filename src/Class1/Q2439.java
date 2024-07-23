package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2439 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(br.readLine());

    for(int i = 0; i < N; i++){

      for(int j2 = N-1; j2 > i; j2--) {
        System.out.print(" ");
      }

      for(int j1 = 0; j1 <= i; j1++){
        System.out.print("*");
      }

      System.out.println();

    }
  }

}

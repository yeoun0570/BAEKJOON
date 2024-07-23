package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1330 {


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int A = Integer.parseInt(st.nextToken());
    int B = Integer.parseInt(st.nextToken());

    if (A >= -10000 && B <= 10000) {
      if (A > B) {
        System.out.println(">");
      } else if (A == B) {
        System.out.println("==");
      } else {
        System.out.println("<");
      }
    }

  }
}

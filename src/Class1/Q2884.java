package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int H = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    if(H <= 23 && H >= 0 && M >= 0 && M <= 59) {

      int second = H * 3600 + M * 60 - 2700;
      int minute = M * 60 - 2700;

      if (second >= 0) {
        H = second / 3600;
      } else {
        H = (86400 - Math.abs(second)) / 3600;
      }


      if (minute < 0) {
        M = 60 - (Math.abs(minute) / 60);
      } else {
        M = minute / 60;
      }


      System.out.println(H + " " + M);
    }
  }
}

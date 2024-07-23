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

    int n = (86400 - Math.abs(H * 3600 + M * 60 - 2700)) / 3600;
    int n2 = (86400 - Math.abs(H * 3600 + M * 60 - 2700)) / ;
    System.out.println(n);
    System.out.println(n2);

  }

}

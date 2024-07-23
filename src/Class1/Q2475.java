package Class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2475 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int[] number = new int[5];
    int compareNo = 0;

    for (int i = 0; i < number.length; i++) {
      int no = Integer.parseInt(st.nextToken());
      number[i] = no;
    }

    for (int i = 0; i < number.length; i++) {
      compareNo += number[i]*number[i];
    }
    compareNo = compareNo%10;
    System.out.println(compareNo);

  }
}

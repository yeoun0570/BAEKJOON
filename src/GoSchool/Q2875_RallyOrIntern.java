package GoSchool;

import java.io.BufferedReader;
import java.util.Scanner;

public class Q2875_RallyOrIntern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int female = sc.nextInt();
        int n = female;
        int male = sc.nextInt();
        int m = male;
        int k = sc.nextInt();
        int teams = 0;
        int maxTeams = 0;

        for (int i = 0; i <= k; i++) {
            female = female - i;
            for (int j = k; j >= i; j--) {
                male = male - j;
                if ((female == male * 2 || female == male * 2 + 1) && female > 0 && male > 0 && i + j == k) {
                    teams = female / male;
                    maxTeams = Math.max(maxTeams, teams);
                }
                male = m;
            }
            female = n;
        }
        System.out.println(maxTeams);

    }
}

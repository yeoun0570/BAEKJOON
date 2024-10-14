package GoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309_SevenDwarf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] fakeDwarfs = new int[9];

        for (int i = 0; i < fakeDwarfs.length; i++) {
            fakeDwarfs[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < fakeDwarfs.length; i++) {
            sum += fakeDwarfs[i];
        }


        Arrays.sort(fakeDwarfs);

        int fake1 =0;
        int fake2 =0;

        for (int i = 0; i < fakeDwarfs.length; i++) {
            for (int j = i + 1; j < fakeDwarfs.length; j++) {
                if(sum - fakeDwarfs[i] - fakeDwarfs[j] == 100){
                    fake1 = fakeDwarfs[i];
                    fake2 = fakeDwarfs[j];
                }
            }
        }

        for (int i = 0; i < fakeDwarfs.length; i++) {
            if(fakeDwarfs[i] != fake1 && fakeDwarfs[i] != fake2){
                System.out.println(fakeDwarfs[i]);
            }
        }


    }
}

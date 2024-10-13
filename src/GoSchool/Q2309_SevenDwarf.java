package GoSchool;

import java.util.Arrays;
import java.util.Scanner;

public class Q2309_SevenDwarf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] fakeDwarfs = new int[9];
        int[] dwarfs = new int[7];

        for(int i = 0; i < fakeDwarfs.length; i++){
            fakeDwarfs[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < fakeDwarfs.length; i++){
            sum += fakeDwarfs[i];
            if (sum <= 100) {
                System.out.println(fakeDwarfs[i]);
            }
        }

        Arrays.sort(fakeDwarfs);

    }
}

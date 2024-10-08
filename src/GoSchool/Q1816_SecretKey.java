package GoSchool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Q1816_SecretKey {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Long[] arr = new Long[n];
        List<Integer> secretList = new ArrayList<>();
        String result = "";


        for(int i = 0; i < arr.length; i++){
            arr[i] = Long.parseLong(br.readLine());
        }

        for(int i = 0; i < arr.length; i++){


            innerLoop:
            for(int j = 2; j <= arr[i]; j++) {
                while(arr[i] % j == 0) {
                    arr[i] /= j;

                    if(j != 1 && j <= 1000000) {
                        secretList.add(j);
                        break innerLoop;
                    }
                    else if (j != 1) {
                        secretList.add(j);
                        break innerLoop;
                    }
                }
            }

            for(int k = 0; k < secretList.size(); k++){
                if(secretList.get(k) > 1000000){
                    result = "YES";
                } else {
                    result = "NO";
                    break;
                }
            }

            System.out.println(result);

            secretList = new ArrayList<>();
            result = "";
        }
    }
}

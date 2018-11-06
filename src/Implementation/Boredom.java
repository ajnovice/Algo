package Implementation;

import java.util.Arrays;
import java.util.Scanner;

public class Boredom {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] inputs = new int[n];
        int max_range=0;
        for(int i=0;i<n;i++){
            inputs[i]=scan.nextInt();
            if(max_range<inputs[i]){
                max_range=inputs[i];
            }
        }
        int[] cnt = new int[max_range+1];

//        Arrays.fill(cnt,0);

        for(int i=0;i<n;i++){
            cnt[inputs[i]]+=1;
        }

        int[] result = new int[max_range+1];
        result[0]=0;
        result[1]=cnt[1];
        for(int i=2;i<=max_range;i++){
            result[i]= Math.max(result[i-1],result[i-2]+(cnt[i]*i));
        }
        System.out.println(result[max_range]);

    }
}

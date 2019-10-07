package leetcode;

import java.util.Arrays;

public class DivisorGame {

    private static boolean game(int N){
        boolean[] result = new boolean[N+1];
        Arrays.fill(result,false);
        if(N==1)
            return false;
        if(N==2)
            return true;
        result[2]=true;
        for(int i=4;i<=N;i++){
            int k=1;
            while(k<i){
                if((i%k==0) && !result[i-k]){
                    result[i]=true;
                    break;
                }
                k++;
            }
        }

        return result[N];
    }
    public static void main(String[] args){
        System.out.println(game(10));
    }
}

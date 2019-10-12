package DP;

import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingSubsequence {

    private static int longest(int[] arr){
        if(arr.length <=1)
            return arr.length;
        int n = arr.length;
        Integer[] result = new Integer[n];
        Arrays.fill(result,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && result[i]<result[j]+1){
                    result[i]=result[j]+1;

                }
            }
        }
        return Collections.max(Arrays.asList(result));


    }

    public static void main(String[] args){
        int[] arr = {3, 10, 2, 1, 20};
        System.out.println(longest(arr));

    }
}

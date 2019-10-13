package DP;

import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingOddEvenSubsequence {

    private static int longest(Integer[] arr){
        int n = arr.length;
        Integer[] result = new Integer[n];
        Arrays.fill(result,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && result[i]<(result[j]+1) && ((arr[i]%2)!=(arr[j]%2))){
                    result[i]=result[j]+1;
                }
            }
        }
        return Collections.max(Arrays.asList(result));
    }

    public static void main(String[] args){
        Integer arr[] = { 1, 12, 2, 22, 5, 30, 31, 14, 17, 11 };
        System.out.println(longest(arr));
    }
}

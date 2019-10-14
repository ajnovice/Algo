package DP;

import java.util.Arrays;
import java.util.Collections;

public class MaximumSumIncreasingSubsequence {

    private static int maximum(int[] arr){
        int n = arr.length;
        Integer[] result = new Integer[n];
        for(int i=0;i<n;i++){
            result[i]=arr[i];
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && result[i]<(result[j]+arr[i])){
                    result[i]=result[j]+arr[i];
                }
            }
        }
        return Collections.max(Arrays.asList(result));
    }

    public static void main(String[] args){
        int arr[] = {1, 101, 2, 3, 100, 4, 5};
        System.out.println(maximum(arr));
    }
}

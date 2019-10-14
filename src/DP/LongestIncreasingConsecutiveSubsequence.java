package DP;

import java.util.Arrays;
import java.util.Collections;

public class LongestIncreasingConsecutiveSubsequence {

    private static int longest(int[] arr){
        int n=arr.length;
        int[] result = new int[n];
        Arrays.fill(arr,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[j]<arr[i] && (result[i]<(result[j]+1))){
                    result[i]=result[j]+1;
                }
            }
        }
        int max=1;
        int curr=1;
        for(int i=0;i<result.length-1;i++){
            if((result[i]+1)==result[i+1]&&(max<(curr+1))){
                max=curr+1;
                curr=max;
            }else
                curr=1;
        }
        return max;
    }

    public static void main(String[] args){
        int a[] = { 3, 10, 3, 11, 4, 5, 6, 7, 8, 12 };
        System.out.println(longest(a));
    }
}

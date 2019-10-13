package DP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LongestCommonIncreasingSubsequence {

    private static int longest(Integer[] arr1,Integer[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[][] dp = new int[n+1][m+1];
        for(int i =0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0)
                    dp[i][j]=0;
                else if(arr1[i-1].equals(arr2[j-1]))
                    dp[i][j]=dp[i-1][j-1]+1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        int count = dp[n][m];
        Integer[] result1 = new Integer[count];
        int i=n;
        int j=m;
        while(i>0&&j>0){
            if(arr1[i-1].equals(arr2[j-1])){
                result1[count-1]=arr1[i-1];
                count--;
                i--;
                j--;
            }else if(dp[i-1][j]>dp[i][j-1])
                i--;
            else
                j--;
        }
        Integer[] result2 = new Integer[result1.length];
        for(int k=0;k<result1.length;k++)
            result2[k]=1;
        for(int k=1;k<result1.length;k++){
            for(int h=0;h<k;h++){
                if(result1[k]>result1[h] && result2[k]<result2[h]+1){
                    result2[k]=result2[h]+1;
                }
            }
        }

        return Collections.max(Arrays.asList(result2));

    }

    public static void main(String[] args){
        Integer arr1[] = {3, 4, 9, 1};
        Integer arr2[] = {5, 3, 8, 9, 10, 2, 1};
        System.out.println(longest(arr1,arr2));
    }
}

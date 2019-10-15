package DP;

import java.util.Arrays;

public class LongestBitonicSubSequence {

    private static int longest(int[] nums){
        int n=nums.length;
        Integer[] increasing = new Integer[n];
        Integer[] decreasing = new Integer[n];
        Arrays.fill(increasing,1);
        Arrays.fill(decreasing,1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]&& increasing[i]<(increasing[j]+1)){
                    increasing[i]=increasing[j]+1;
                }
            }
        }

        for(int i=n-2;i>=0;i--){
            for(int j=n-1;j>i;j--){
                if(nums[i]>nums[j] && decreasing[i]<(decreasing[j]+1)){
                    decreasing[i]=decreasing[j]+1;
                }
            }
        }
        int max = increasing[0]+decreasing[0]-1;
        for(int i=1;i<n;i++){
            if(max<(increasing[i]+decreasing[i]-1)){
                max = increasing[i]+decreasing[i]-1;
            }
        }
        return max;
    }

    public static void main(String[] args){
        int arr[] = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        System.out.println(longest(arr));
    }
}

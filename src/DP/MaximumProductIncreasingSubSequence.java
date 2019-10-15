package DP;

import java.util.TreeSet;

public class MaximumProductIncreasingSubSequence {


    private static int maxProduct(int[] arr){
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0]=-1;
        TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<n;i++){
            if(set.lower(arr[i])!=null){
                Integer k =set.lower(arr[i]);
                left[i]=(int)k;
            }else{
                left[i]=-1;
            }
            set.add(arr[i]);
        }
        right[n-1]=-1;
        int m=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(m<arr[i]){
                m=arr[i];
            }
            right[i]=m;
        }
        int max=0;
        for(int i=1;i<n-1;i++){
            if(left[i]!=-1 && right[i]!=-1) {
                int product = left[i] * arr[i] * right[i];
                if (product > max) {
                    max = product;
                }
            }
        }
        return max;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 4};
        System.out.println(maxProduct(arr));
    }
}

package DP;

import java.util.ArrayList;
import java.util.List;


public class LongestIncreasingConsecutiveSubsequence {

    static class Pair{
        int index;
        List<Integer> list;
        Pair(int index,List<Integer> list){
            this.index=index;
            this.list=list;
        }
    }

    private static int longestNaive(int[] arr){
        int n=arr.length;
        List<Pair> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            int prev=arr[i];
            List<Integer> x = new ArrayList<>();
            x.add(arr[i]);
            result.add(new Pair(i,x));
            for(int j=i;j<n;j++){
                if((prev+1)==arr[j]){
                    result.get(i).list.add(arr[j]);
                    prev=arr[j];
                }
            }
        }
        int max=0;
        for(Pair pair:result){
            if(pair.list.size()>max){
                max=pair.list.size();
            }
        }
        return max;
    }

    public static void main(String[] args){
        int a[] = { 1,2,3,4,5,6,7,8,9 };
        System.out.println(longestNaive(a));
    }
}

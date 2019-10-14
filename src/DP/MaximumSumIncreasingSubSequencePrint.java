package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumSumIncreasingSubSequencePrint {

    static class Pair {
        int sum;
        List<Integer> list;

        Pair(int sum, List<Integer> list) {
            this.sum = sum;
            this.list = list;
        }
    }

    private static void printMax(int[] arr){
        int n = arr.length;
        List<Pair> lists = new ArrayList<>();
        for (int num: arr) {
            List<Integer> x = new ArrayList<>();
            x.add(num);
            lists.add(new Pair(num,x));
        }

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j] && lists.get(i).sum<(lists.get(j).sum+arr[i])){
                    lists.get(i).sum=lists.get(j).sum+arr[i];
                    lists.get(i).list.add(arr[j]);
                }
            }
        }
        Pair maxPair=lists.get(0);
        int max=lists.get(0).sum;
        for (Pair pair:lists) {
            if(max<pair.sum){
                max=pair.sum;
                maxPair=pair;
            }
        }
        Collections.sort(maxPair.list);
        System.out.println(maxPair.list);
    }

    public static void main(String[] args){
        int arr[] = { 3, 2, 6, 4, 5, 1 };
        printMax(arr);
    }

}

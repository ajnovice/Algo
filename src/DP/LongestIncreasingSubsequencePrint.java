package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestIncreasingSubsequencePrint {

    static class Pair {
        int index;
        List<Integer> list;

        Pair(int index, List<Integer> list) {
            this.index = index;
            this.list = list;
        }
    }

    private static void longest(int[] arr) {
        int n = arr.length;
        List<Pair> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> x = new ArrayList<>();
            x.add(arr[i]);
            result.add(new Pair(i, x));
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i]>arr[j] && result.get(i).list.size()<(result.get(j).list.size()+1)) {
                    result.get(i).list.add(arr[j]);
                }
            }
        }
        List<Integer> maxList = result.get(0).list;
        int max = result.get(0).list.size();
        for(Pair pair:result){
            if(max<pair.list.size()){
                max = pair.list.size();
                maxList = pair.list;
            }
        }
        Collections.sort(maxList);
        System.out.println(maxList);

    }

    public static void main(String[] args) {
        int a[] = {10, 22, 9, 33, 21, 50, 41, 60};
        longest(a);
    }
}

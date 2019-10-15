package DP;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaximumLengthChainPairs {

    static class Pair{
        int a,b;
        Pair(int a,int b){
            this.a=a;
            this.b=b;
        }

    }

    private static int longest(Pair[] pairs){
        Arrays.sort(pairs, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.a-o2.a;
            }
        });

        int n= pairs.length;
        Integer[] result = new Integer[n];
        Arrays.fill(result,1);
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(pairs[i].a>pairs[j].b && result[i]<(result[j]+1)){
                    result[i]=result[j]+1;
                }
            }
        }
        return Collections.max(Arrays.asList(result));
    }

    public static void main(String[] args){
        Pair arr[] = {  new Pair(15, 25),new Pair(5, 24), new Pair(27, 40), new Pair(50, 60) };
        System.out.println(longest(arr));
    }
}

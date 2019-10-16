package Array;

import java.util.HashMap;
import java.util.Map;

public class CheckPair {

    private static void check(int[] arr,int x){
        Map<Integer,Integer> mp = new HashMap<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(mp.containsKey(x-arr[i])){
                System.out.println("We have pair of number "+ arr[i]+" and "+(x-arr[i])+" for sum ="+x);
                return;
            }else
                mp.put(arr[i],1);
        }
        System.out.println("No Pair");
        return;
    }

    public static void main(String[] args){
        int A[] = { 1, 4, 45, 6, 10, 8 };
        check(A,16);
    }
}

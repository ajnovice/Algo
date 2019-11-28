package leetcode;

import java.util.*;

public class Duplicates {

    private static class Pair{
        int x,y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }

    private static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                int j=mp.get(nums[i]);
                mp.put(nums[i],i);
                if(i-j<=k)
                    return true;

            }else{
                mp.put(nums[i],i);
            }
        }
        return false;

    }

    public static void main(String[] args){
        int[] k = {1,2,3,1,2,3};
//        System.out.println(containsNearbyDuplicate(k,2));
        List<Pair> p = new ArrayList<>();
        p.add(new Pair(1,2));
        p.add(new Pair(1,5));
        p.add(new Pair(5,12));
        p.add(new Pair(7,2));
        p.add(new Pair(9,56));
        p.add(new Pair(2,90));
        p.add(new Pair(2,1));

        Collections.sort(p, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if(o1.x<o2.x){
                    return o1.x-o2.x;
                }else{
                    return o2.y-o1.y;
                }
            }
        });

        for (Pair pp : p) {
            System.out.println(pp.x+" "+pp.y);
        }
    }


}


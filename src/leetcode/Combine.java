package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Combine {
    private static List<String> combine(List<String> phrases){
        Map<String,String> mp = new HashMap<>();
        List<String> res = new ArrayList<>();
        int n = phrases.size();
        for(int i=0;i<n;i++){
            int index = phrases.get(i).indexOf(" ");
            String first = phrases.get(i).substring(0,index);
            String last = phrases.get(i).substring(index);
            mp.put(first,last);
        }

        for(int i=0;i<n;i++){
            boolean flag = false;
            String temp = phrases.get(i);
            while(true){
                String ending = temp.substring(temp.lastIndexOf(" ")+1);
                if(mp.containsKey(ending)){
                    flag=true;
                    temp+=mp.get(ending);
                }else{
                    break;
                }
            }
            if(flag)
                res.add(temp);
        }
        return res;
    }

    public static void main(String[] args){
        List<String> k = new ArrayList<>();
        k.add("I like bubblegum");
        k.add("bubblegum that is pink");
        k.add("hi, how are you today");
        k.add("today on this fine day");
        k.add("day that is sunny");
        System.out.println(combine(k));
    }
}

package String;

import java.util.*;

public class AllAnagram {

    public static void printAll(String[] words){
        Map<Integer, Vector<String>> mp = new HashMap<>();
        for(int i=0;i<words.length;i++){
            char[] charword = words[i].toCharArray();
            Arrays.sort(charword);
            if(mp.containsKey(Arrays.hashCode(charword))){
                Vector<String> vec = mp.get(Arrays.hashCode(charword));
                vec.add(words[i]);
                mp.put(Arrays.hashCode(charword),vec);

            }
            else{
                Vector<String> vec = new Vector<>();
                vec.add(words[i]);
                mp.put(Arrays.hashCode(charword),vec);
            }
        }
        for (Map.Entry<Integer,Vector<String>> entry:mp.entrySet()) {
            Iterator<String> itr = entry.getValue().iterator();
            while (itr.hasNext()) {
                System.out.println(itr.next());
            }
        }
    }

    public static void main(String[] args){
        String[] words = { "cat", "dog", "tac", "god", "act" };
        printAll(words);
    }
}

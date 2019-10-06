package String;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class ArrangeAdjacentCharacter {

    public static class Pair {
        char value;
        int freq;

        Pair(char value, int freq) {
            this.value = value;
            this.freq = freq;
        }
    }

    private static void arrange(String s1) {
        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (mp.containsKey(s1.charAt(i))) {
                Integer freq = mp.get(s1.charAt(i));
                freq += 1;
                mp.put(s1.charAt(i), freq);
            } else {
                mp.put(s1.charAt(i), 1);
            }
        }

        PriorityQueue<Pair> que = new PriorityQueue<>(mp.size(), new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.freq - o1.freq;
            }
        });

        for (Map.Entry<Character, Integer> k : mp.entrySet()) {
            que.add(new Pair(k.getKey(), k.getValue()));
        }

        String result = "";
        Pair prev = null;

        while (!que.isEmpty()) {
            Pair top = que.poll();
//            System.out.println(top.value+" "+top.freq);
            if (prev != null && prev.freq > 0) {
                que.add(prev);
            }
            result += String.valueOf(top.value);
            top.freq--;
            prev = top;
        }

        if (result.length() == s1.length()) {
            System.out.println(result);
        } else {
            System.out.println("Not possible");
        }

    }

    public static void main(String[] args) {
        String s1 = new String("ababa");
        String s2 = "abccc";
        String s3 = "aaaabc";
        arrange(s1);
        arrange(s2);
        arrange(s3);
    }
}

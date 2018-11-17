package String;

import java.util.HashSet;

public class Pangram {

    public static void CheckPangram(String s1) {
        HashSet<Character> set = new HashSet<>();
        s1 = s1.toLowerCase();
        for (int i = 0; i < s1.length(); i++) {
            if ('a' <= s1.charAt(i) && s1.charAt(i) <= 'z') {
                set.add(s1.charAt(i));
            }
        }
        if (set.size() == 26) {
            System.out.println("It's a Pangram");
        }
        else if(set.size() == 25){
            System.out.println("It's Pangrammatic Lipogram");
        }
        else {
            System.out.println("It's not a Pangram but might be lipogram");
        }
    }

    public static void main(String[] args) {
        String s1 = new String("The quick brown fox jumped over the lazy dog");
        String s2 = new String("The quick brown fox jumps over the lazy dog");
        CheckPangram(s1);
        CheckPangram(s2);
    }
}

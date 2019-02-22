package String;

import java.util.HashSet;
import java.util.Set;

public class PalindromeCounter3 {

    private static void palindromes(String str) {
        int n = str.length();
        Set<String> set = new HashSet<String>();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String temp = str.substring(i, j);
                StringBuilder sb = new StringBuilder(temp);
                sb.reverse();
                if (temp.compareTo(sb.toString()) == 0 && !set.contains(temp)) {
                    count++;
                    System.out.println(temp);
                    set.add(temp);
                }
            }
        }
        System.out.println("Total number of palindromes : " + String.valueOf(count));
    }

    public static void main(String[] args) {
        String str = "abbaeae";
        palindromes(str);

    }
}

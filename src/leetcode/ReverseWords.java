package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseWords {

    private static String reverseWords(String s) {
        s=s.trim();
        String[] words = s.split(" ");
        List<String> word = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(!words[i].equals(""))
                word.add(words[i]);;

        }

        int j=word.size()-1;
        String[] result = new String[word.size()];
        int k=0;
        while(j>=0){
            result[j]=word.get(k);
            k++;
            j--;
        }

        return String.join(" ",result);

    }

    public static void main(String[] args){
        System.out.println(reverseWords("a good   example"));
    }
}

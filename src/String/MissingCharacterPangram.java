package String;

import java.util.Arrays;

public class MissingCharacterPangram {

    public static void missing(String s1){
        boolean hash[] = new boolean[26];
        Arrays.fill(hash,false);
        s1=s1.toLowerCase();
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z'){
                hash[s1.charAt(i)-'a']=true;
            }
        }

        for(int i =0;i<26;i++){
            if(!hash[i])
            System.out.print((char)(i+'a'));
        }
    }

    public static void main(String[] args) {
        String s1 = new String("The quick brown fox jumps over the lazy dog");
        String s2 = new String("The quick brown fox jumps");
        missing(s1);
        missing(s2);

    }
}

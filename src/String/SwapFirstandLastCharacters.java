package String;

import java.util.ArrayList;
import java.util.List;

public class SwapFirstandLastCharacters {

    private static String swapCharactersForEntireString(String str){
        char[] cstr = str.toCharArray();
        int i=0;
        int j=str.length()-1;
        char temp;
        while(i<j){
            while(cstr[i]==' ' && i<j){
                i++;
            }
            while (cstr[j]==' ' && j>i){
                j--;
            }
            if(cstr[i]!=cstr[j] && i<str.length()) {
                temp = cstr[i];
                cstr[i] = cstr[j];
                cstr[j] = temp;
            }
            i++;
            j--;
        }
        return new String(cstr);
    }

    private static String SwapCharacterCharactersOfEachWord(String str){
        String[] words = str.split(" ");
        List<String> result = new ArrayList<>();
        for(String word:words){
            char[] cword = word.toCharArray();
            char t = cword[0];
            cword[0]=cword[word.length()-1];
            cword[word.length()-1]=t;
            result.add(new String(cword));
        }
        return String.join(" ",result);
    }

    public static void main(String[] args){
        System.out.println(swapCharactersForEntireString("geeks for geeks"));
        System.out.println(SwapCharacterCharactersOfEachWord("geeks for geeks"));
    }
}

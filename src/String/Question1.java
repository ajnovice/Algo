package String;

import java.util.ArrayList;

public class Question1 {

    public static String  gameWinner(String color){
        int wcount=0;
        int bcount=0;
        int w=0;
        for(int i =0;i<color.length();i++){
            if('w' == color.charAt(i)){
                w++;
                if(w>2){
                    wcount++;
                }
            }
            else{
                w=0;
            }
        }
        w=0;
        for(int i =0;i<color.length();i++){
            if('b' == color.charAt(i)){
                w++;
                if(w>2){
                    bcount++;
                }
            }
            else{
                w=0;
            }
        }
        if (wcount>bcount){
            return "Wendy";
        }
        else{
            return "Ben";
        }
    }
    public static void main(String[] args) {
        System.out.println(gameWinner("xxx"));

    }
}

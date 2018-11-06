package Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LexicographicallyMinimum1 {

    private static void minimum(String str) {
        int len = str.length();
        char charArray[] = str.toCharArray();
        int min_index = 0;
        char min_value=charArray[min_index];
        for(int i=0;i<len;i++){
            if(min_value>charArray[i]){
                min_index=i;
                min_value=charArray[i];
            }
        }
        System.out.println(str.concat(str).substring(min_index,min_index+len));

    }

    private static void printrotations(ArrayList<String> rotations) {
        for (String rot: rotations) {
            System.out.println(rot);
        }
    }

    public  static boolean areRotations(String str1,String str2){
        return str1.length() == str2.length() && (str1.concat(str1).indexOf(str2)!=1);
    }

    public static void main(String[] args) {

        String str = "CDFTGHAGH";
        minimum(str);

    }
}

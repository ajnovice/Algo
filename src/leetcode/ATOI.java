package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ATOI {

    private static int myAtoi(String str){
        str = str.trim();
        List<Character> chars = new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(Character.isDigit(str.charAt(i)) || str.charAt(i) == '-'){
                chars.add(str.charAt(i));
            }else{
                break;
            }
        }

        int n= chars.size();
        int j=n-1;
        int res=0;
        int i=0;
        boolean f = false;
        if(chars.get(0)=='-') {
            i++;
            f=true;
        }
        for(;i<n;i++){
            res+=(chars.get(i)-'0')*Math.pow(10,j);
            j--;
        }
        if(f)
            return -1*res;
        return res;

    }

    public  static void main(String[] args){
        String a = "     -42";
        System.out.println(myAtoi(a));
    }
}

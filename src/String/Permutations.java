package String;

public class Permutations {

    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void permutate(String s, int l, int r) {
        if (l == r) {
            System.out.println(s);
        } else {
            for(int i=l;i<=r;i++){
                s=swap(s,i,l);
                permutate(s,l+1,r);
                s=swap(s,l,i);
            }
        }
    }

    public static void main(String[] args) {
        String s ="abcd";
        permutate(s,0,s.length()-1);
    }
}

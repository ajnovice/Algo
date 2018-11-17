package String;

public class CopyString {

    public static String copy(String s1,String s2){
        char[] char1 = s1.toCharArray();
        char[] char2 = new char[s1.length()];
        for(int i=0;i<char1.length;i++){
            char2[i]=char1[i];
        }
        return new String(char2);
    }

    public static String copyrecursive(char[] ch,char[] ch1,int n){
        if(n==ch.length){
            return new String(ch1);
        }
        else{
            ch1[n]=ch[n];
            return copyrecursive(ch,ch1,n+1);
        }
    }

    public static void main(String[] args){
        String str1 = new String("Computer Science");
        String str2 = new String("University of Texas,Dallas");
        System.out.println(copy(str1,str2));
        System.out.println(copyrecursive(str1.toCharArray(),new char[str1.length()],0));


    }
}

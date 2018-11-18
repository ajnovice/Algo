package String;

public class NameIntials {

    public static void nameIntials(String s){
        String[] ss = s.split(" ");
        for(String k:ss){
            System.out.print(k.charAt(0)+" ");
        }
    }

    public static void main(String[] args){
        String s = "Jude Law";
        nameIntials(s);
    }
}

package String;

public class RoundTheNumber {

    private static Integer roundTheNumber(Integer num){
        int a=num%10;
        if (a<5){
            return (num/10)*10;
        }else{
            int d = 10-a;
            return num+d;
        }
    }

    public static void main(String[] args){
        System.out.println(roundTheNumber(10));
    }
}

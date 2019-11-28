package leetcode;

public class Divide {

    private static  int divide(int dividend, int divisor) {

        int count =0;
        long d1=Math.abs(dividend);
        long d2=Math.abs(divisor);
        int a1=0,a2=0;
        if(dividend<0){

            a1=1;
        }
        if(divisor<0){

            a2=1;
        }
        while(d1>=d2){
            count++;
            d1-=d2;
        }

        if((a1^a2)==1){
            return -1*count;
        }
        return count;

    }

    public static void main(String[] args){
        System.out.println(divide(-2147483648,-1));
    }
}

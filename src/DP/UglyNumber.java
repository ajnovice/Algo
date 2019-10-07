package DP;

public class UglyNumber {


    private static int ugly(int n){

        if(n<=1)
            return n;
        int i2=0,i3=0,i5=0;
        int[] ug = new int[n];
        ug[0]=1;
        int next_2=2,next_3=3,next_5=5;
        int next =0;
        for(int i=1;i<n;i++){
            next=Math.min(next_2,Math.min(next_3,next_5));
            ug[i]=next;
            if(next==next_2){
                i2+=1;
                next_2=ug[i2]*2;
            }
            if(next==next_3){
                i3+=1;
                next_3=ug[i3]*3;
            }
            if(next==next_5){
                i5+=1;
                next_5=ug[i5]*5;
            }


        }
        return next;
    }

    public static void main(String[] args){
        System.out.println(ugly(150));
    }
}

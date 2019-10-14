package DP;

public class PR2 {

    private static int compute_number_score(int number) {
        char s[] = String.valueOf(number).toCharArray();
        int score = 0,i,j=1,n=s.length;
        char p='a';
        for(i=0;i<n;i++){
            if(s[i]=='5')score+=2;
            if(p=='3'){
                score+=4;
            }
            if(s[i]==p+1){
                j++;
            }
            else {
                score+=j*j;
                j=1;
            }
            score+=s[i]%2;
            p=s[i];
        }
        score+=j*j;
        if(s[n-1]=='5')score+=6;
        return score-1;
    }

    public static void main(String[] args){
        System.out.println(compute_number_score(3333));
    }
}

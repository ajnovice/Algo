package String;

public class FindLongestPalindromicSubString {
    private static String longestPalindrome(String str){
        int n= str.length();
        boolean dp[][] = new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
        }
        int max_index = 0;
        int size = 1;
        for(int i=0;i<n-1;i++){
            if(str.charAt(i) == str.charAt(i+1)){
                dp[i][i+1]=true;
                max_index=i;
                size=2;
            }
        }
        for(int gap=3;gap<=n;gap++){
            for(int i=0;i<n-gap+1;i++){
                int j=i+gap-1;
                if(str.charAt(i) == str.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    if(size<gap){
                        max_index=i;
                        size=gap;
                    }
                }
            }
        }
        return str.substring(max_index,max_index+size);

    }

    public static void main(String[] args){
        String str = "forgeeksskeegfor";
        System.out.println(longestPalindrome(str));
    }
}

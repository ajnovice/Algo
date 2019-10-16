package DP;

public class LongestPalindromicSubSequence {

    private static int longest(String str){
        int n = str.length();
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=1;
        }
        for(int l=2;l<=n;l++){
            for(int i=0;i<n-l+1;i++){
                int j=i+l-1;
                if(str.charAt(i) == str.charAt(j) && l==2)
                    dp[i][j]=2;
                else if(str.charAt(i) == str.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }

            }
        }
        return dp[0][n-1];

    }

    public static void main(String[] args){
        String str = "GEEKS FOR GEEKS";
        System.out.println(longest(str));
    }
}

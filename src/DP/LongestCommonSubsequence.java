package DP;

public class LongestCommonSubsequence {

    private static int longest(char[] arr1,char[] arr2,int n,int m){
        if(n==0||m==0)
            return 0;
        if(arr1[n-1]==arr2[m-1])
            return longest(arr1,arr2,n-1,m-1)+1;
        return Math.max(longest(arr1,arr2,n-1,m),longest(arr1,arr2,n,m-1));
    }

    private static int longest1(char[] arr1,char[] arr2){
        int n=arr1.length;
        int m =arr2.length;
        int[][] result = new int[n+1][m+1];
        for(int i=0;i<=n;i++){
            for(int j=0;j<=m;j++){
                if(i==0||j==0)
                    result[i][j]=0;
                else if(arr1[i-1]==arr2[j-1])
                    result[i][j]=result[i-1][j-1]+1;
                else
                    result[i][j]=Math.max(result[i-1][j],result[i][j-1]);
            }
        }
        return result[n][m];
    }

    public static void main(String[] args){
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        int n=X.length();
        int m=Y.length();
        System.out.println(longest(X.toCharArray(),Y.toCharArray(),n,m));
        System.out.println(longest1(X.toCharArray(),Y.toCharArray()));
    }
}

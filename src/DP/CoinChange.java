package DP;

public class CoinChange {

    private static int coinChange(int arr[],int n,int sum){
        if(sum==0)
            return 1;
        if(sum<0)
            return 0;
        if(n<=0)
            return 0;
        return coinChange(arr,n-1,sum)+coinChange(arr,n,sum-arr[n-1]);
    }

    private static int coinChange1(int[] arr,int n,int sum){
        int[][] result = new int[n][sum+1];
        for(int i=0;i<n;i++)
            result[i][0]=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=sum;j++){
                int x = (j-arr[i])>=0?result[i][j-arr[i]]:0;
                int y = i>0?result[i-1][j]:0;
                result[i][j]=x+y;
            }
        }
        return result[n-1][sum];
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 3};
        System.out.println(coinChange(arr,arr.length,4));
        System.out.println(coinChange1(arr,arr.length,4));
    }
}

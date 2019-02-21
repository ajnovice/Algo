package String;

public class CountPalindromicSubString1 {

    public static int countPalindrome(String str) {
        int n = str.length();
        boolean palindrome[][] = new boolean[n][n];
        int dp[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            palindrome[i][i] = true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                palindrome[i][i + 1] = true;
            }
        }
        for (int gap = 2; gap < n; gap++) {
            for (int i = 0; i < n - gap; i++) {
                int j = i + gap;
                if (str.charAt(i) == str.charAt(j) && palindrome[i + 1][j - 1]) {
                    palindrome[i][j] = true;
                }
                if (palindrome[i][j]) {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - 1] + 1 - dp[i + 1][j - 1];
                } else {
                    dp[i][j] = dp[i + 1][j] + dp[i][j - 1] - dp[i + 1][j - 1];
                }
            }
        }
        return dp[0][n - 1];
    }

    public static void main(String[] args) {
        String str = "abbaeae";
        System.out.println(countPalindrome(str));
    }
}

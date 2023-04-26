package dynamicProgramming;

public class LongestSubSequence {
    public static void main(String[] args) {
        longestSubsequence();
    }
    static void longestSubsequence() {
        String s1 = "aegwegsdfg";
        String s2 = "wefgegsd";
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1] + 1;
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        System.out.println(dp[s1.length()][s2.length()]);
    }
}

package dynamicProgramming;

public class LongestPalindromeSubsequence {
    public static void main(String[] args) {
        System.out.println("The length of the LPS using recursion is " +lps1("bbbab")); // Outputs 4 since "bbbb" is valid solution
        System.out.println("The length of the LPS using recursion is " + lps1("bccd")); // Outputs 2 since "cc" is valid solution
        String seq = "bab";
        System.out.println("The length of the LPS using dynamic programming is " + lps2(seq));
    }
    // Returns the length of the longest palindrome subsequence
    public static int lps1(String s) {
        if (s == null || s.length() == 0) return 0;
        Integer[][] dp = new Integer[s.length()][s.length()];
        return lps(s, dp, 0, s.length() - 1);
    }
    private static int lps(String s, Integer[][] dp, int i, int j) {
        // Base cases
        if (j < i) return 0;
        if (i == j) return 1;
        if (dp[i][j] != null) return dp[i][j];
        char c1 = s.charAt(i), c2 = s.charAt(j);
        if (c1 == c2) return dp[i][j] = lps(s, dp, i + 1, j - 1) + 2;
        // Consider both possible substrings and take the maximum
        return dp[i][j] = Math.max(lps(s, dp, i + 1, j), lps(s, dp, i, j - 1));
    }
    static int max(int x, int y) { return (x > y) ? x : y; }
    static int lps2(String seq) {
        int n = seq.length();
        int i, j, cl;
        int L[][] = new int[n][n];
        for (i = 0; i < n; i++) L[i][i] = 1;// Strings of length 1 are palindrome of length 1
        // Build the table. Note that the lower diagonal values of table are useless and not filled in the process.
        // cl is length of substring
        for (cl = 2; cl <= n; cl++) {
            for (i = 0; i < n - cl + 1 ; i++) {
                j = i + cl - 1;
                if (seq.charAt(i) == seq.charAt(j)&& cl == 2) L[i][j] = 2;
                else if (seq.charAt(i) == seq.charAt(j)) L[i][j] = L[i + 1][j - 1] + 2;
                else L[i][j] = max(L[i][j - 1], L[i + 1][j]);
            }
        }
        for(int p=0;p<n;p++){
            for(int q=0;q<n;q++)System.out.print(L[p][q]+" ");
            System.out.println();
        }
        return L[0][n - 1];//the max value is always stored only in this position...
    }
}
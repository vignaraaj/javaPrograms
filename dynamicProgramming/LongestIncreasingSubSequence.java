package dynamicProgramming;

import java.util.Arrays;
public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        longestIncreasingSubsequence();
    }
    static void longestIncreasingSubsequence() {
        int[] arr = { 1,2,3,2,9,-3};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLen = 1;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++) if(arr[i]>arr[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            maxLen = Math.max(maxLen,dp[i]);
        }
        System.out.println( maxLen );
    }
}

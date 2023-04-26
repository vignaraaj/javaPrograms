package logicalProgOnNumbers;

public class CountDecodings {
    public static int countDecodings(String digits) {
        int n = digits.length();
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(digits.substring(i-1, i));
            int twoDigits = Integer.parseInt(digits.substring(i-2, i));
            if (oneDigit >= 1 && oneDigit <= 9) dp[i] += dp[i-1];
            if (twoDigits >= 10 && twoDigits <= 26) dp[i] += dp[i-2];
        }
        for(int i=0;i<dp.length;i++) System.out.print(dp[i]+" ");
        System.out.println();
        return dp[n];
    }
    public static void main(String[] args) {
        System.out.println(countDecodings("121"));
    }
}
//Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a digit sequence, count the number of possible decodings of the given digit sequence.
//
//        Examples:
//
//        Input: digits[] = “121”
//        Output: 3  The possible decodings are “ABA”, “AU”, “LA”
//
//        Input: digits[] = “1234” Output: 3
//
//The possible decodings are “ABCD”, “LCD”, “AWD”

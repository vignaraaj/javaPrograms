package dynamicProgramming;
public class SumOfAlternateSubSequence {
    public static void main(String[] args) {
        int arr1[] = {3, 2, 7, 10};
        int arr2[] = {5, 4, 5, 4};
        int arr3[] = {1, 2, 3};
        int arr4[] = {3, 2, 5, 10, 7};
        int arr5[] = {5, 5, 10, 100, 10, 5};
        System.out.println(sumOfAlternateSubsequence(arr1));
        System.out.println(sumOfAlternateSubsequence(arr2));
        System.out.println(sumOfAlternateSubsequence(arr3));
        System.out.println(sumOfAlternateSubsequence(arr4));
        System.out.println(sumOfAlternateSubsequence(arr5));
    }
    static int sumOfAlternateSubsequence(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];
        if (n == 2) return Math.max(arr[0], arr[1]);
        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) dp[i] = Math.max(dp[i - 2] + arr[i], dp[i - 1]);
        return dp[n - 1];
    }
}
package dynamicProgramming;

public class getWaysOfCoinRepUsingDP {
    //get the number of ways for ta given number to be filled with the given coin denominations in dynamic programming
    static long getNumberOfWays(int N, int[] coins) {
        int[] ways = new int[N+1];
        ways[0] = 1;
        for(int i=0;i<N;i++) System.out.print(ways[i] +" ");
        System.out.println();
        for (int i = 0; i < coins.length; i++) {
            for (int j = 0; j < ways.length; j++) {
                if (coins[i] <= j) {
                    ways[j] += ways[j - coins[i]];
                    System.out.print(ways[j]+" "+coins[i]+" "+j+"\n");
                }
            }
        }
        System.out.println();
        for(int i=0;i<N;i++) System.out.print(ways[i] +" ");
        return ways[N];
    }
    public static void main(String args[]) {
        int coins[] = { 1, 5, 10 };
        System.out.println("solution : "+getNumberOfWays(12, coins));
    }
}
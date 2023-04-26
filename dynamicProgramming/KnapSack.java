package dynamicProgramming;

public class KnapSack {
    public static void main(String args[])
    {
        int val[] = new int[] { 2,2,4,5,3 };
        int wt[]  = new int[] { 3,1,3,4,2 };
        int W = 7;
        int n = val.length;
        System.out.println("the knapsack capacity is "+W +"\n"+"number of items is "+n);
        System.out.println("the max value stored is "+knapSack(W, wt, val, n));
    }
     static int knapSack(int W,int wt[],int val[],int n){
        int[][] dp = new int[n+1][W+1];
        //row represents items and column represents knapsack capacity(weight)
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                if(i==0 || j==0) dp[i][j]=0;
                else if (wt[i-1]<=j) {
                    dp[i][j] = Math.max(dp[i-1][j],val[i-1]+dp[i-1][j-wt[i-1]]);
                    //the val and wt checks the same i but dp checks its value based on i-1... its because we added new row and col in dp and made its value 0
                    //System.out.print(i+" "+j+" "+wt[i-1] +" "+dp[i-1][j] +" "+(val[i-1]+dp[i-1][j-wt[i-1]])+"\n");
                }
                else dp[i][j]=dp[i-1][j];
            }
        }
         for(int i=0;i<n+1;i++) {
             for (int j = 0; j < W + 1; j++) System.out.print(dp[i][j] + " ");
             System.out.println();
         }
         int res = dp[n][W];
         // to find the selected items
         int j  = W;
         System.out.println("The items selected have the following weights and values : ");
         for (int i = n; i > 0 && res > 0; i--) {
             // either the result comes from the top
             // (K[i-1][w]) or from (val[i-1] + K[i-1][w-wt[i-1]]) as in Knapsack table.
             // If it comes from the latter one/ it means the item is included.
             if (res == dp[i - 1][j]) continue;
             else {
                 // This item is included.
                 System.out.print(wt[i - 1] + " "+val[i-1]+"\n");
                 // Since this weight is included its value is deducted
                 res = res - val[i - 1];
                 j = j - wt[i - 1];
             }
         }
         System.out.println();
        return dp[n][W];
     }
}

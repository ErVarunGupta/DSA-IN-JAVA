package Part_02;

public class unbounded_napsack {
    static int unboundedNapsack(int val[], int wt[], int W){
        int n = val.length;
        int dp[][] = new int[n+1][W+1];
        for(int i = 0; i < n+1; i++){
            dp[i][0] = 0;
        }
        for(int j = 0; j < W+1; j++){
            dp[0][j] = 0;
        }

        for(int i = 1; i < val.length+1; i++){
            int v = val[i-1];
            int w = wt[i-1];
            for(int j = 1; j < W+1; j++){
                if(w <= j){
                    int incProfit = v + dp[i][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                }else{
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int val[] = {15, 14, 10, 45, 30};
        int wt[] = {2, 5, 1, 3, 4};
        int W = 7;

        System.out.println(unboundedNapsack(val, wt, W));
    }
}

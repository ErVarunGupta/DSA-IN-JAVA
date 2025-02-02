package Part_05;

import java.util.Arrays;

public class Catalans_Number {
    //Recursion code
    static int catalan(int n){
        if(n == 0 || n == 1) return 1;

        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += catalan(i) * catalan(n-i-1);
        }
        return ans;
    }
    //Memoization
    static int catalanMemo(int n, int dp[]){
        if(n == 0 || n == 1) return 1;

        if(dp[n] != -1) return dp[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += catalanMemo(i,dp) * catalanMemo(n-i-1, dp);
        }

        dp[n] = ans;
        return dp[n];
    }

    //Tabulation
    static int catalanTab(int n){//O(n*n)
        //create 1D array
        int dp[] = new int[n+1];

        //initialization
        dp[0] = dp[1] = 1;

        //fill up -> buttom up
        for(int i = 2; i < n+1; i++){
            for(int j = 0; j < i; j++){
                dp[i] += dp[j] * dp[i-j-1];// Cn = Cj * Cn-j-1
            }
        }

        return dp[n];
    }

    public static void main(String[] args) {

        int n = 4;
        System.out.println(catalan(n));

        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(catalanMemo(n,dp));

        System.out.println(catalanTab(n));
    }
}

package Part_05;

public class Mountain_Ranges {
    //Tabulation
    static int mountainCount(int n){//O(n*n)
        int dp[] = new int[n+1];
        dp[0] = dp[1] = 1;

        for(int i = 2; i < n+1; i++){
            for(int j = 0; j < i; j++){
                int inside = dp[j];
                int outside = dp[i-j-1];
                dp[i] += inside * outside;
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int pairs = 3;
        System.out.println(mountainCount(pairs));
    }
}

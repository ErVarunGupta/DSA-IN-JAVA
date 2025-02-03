package Part_2;

public class P11_TilingProblem {
    public static void main(String[] args) {
        System.out.println(tilingProblem(3));
    }
    public static int tilingProblem(int n){// 2 * n(floor size)
        //base case
        if(n == 0 || n == 1){
            return 1;
        }
        //kaam
        // Vertical choice
//        int fnm1 = tilingProblem(n-1);
//
//        // horizontal choice
//        int fnm2 = tilingProblem(n-2);
//
//        int totalWays = fnm1 + fnm2;
//        return totalWays;

        return tilingProblem(n-1) + tilingProblem(n-2);
    }
}

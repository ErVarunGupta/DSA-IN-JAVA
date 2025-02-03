package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int accounts[][] = {
                {1,2,3},
                {4,5,6,7},
                {8,0},
                {1,2,3,4,5}
        };
        System.out.println(maxWealth(accounts));
    }

    static int maxWealth(int accounts[][]){
        int ans = Integer.MIN_VALUE;
        for(int[] ints : accounts){
            int sum = 0;
            for(int anInt : ints){
                sum += anInt;
            }
            if(sum > ans){
                ans = sum;
            }
        }
        return ans;
    }
}

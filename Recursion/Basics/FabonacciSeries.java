package Basics;

public class FabonacciSeries {
    public static int fibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = fibonacci(n-1);
        int fnm2 = fibonacci(n-2);
        int ans = fnm1 + fnm2;
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
}

package Recursion;

public class Pattern1 {
    public static void main(String[] args) {
        pattern2(5,0,0);
    }

    static void pattern1(int n, int i){
        if(n < 0){
            return;
        }
        if(i <= n){
            System.out.print("*");
            pattern1(n,i+1);
        }else{
            System.out.println();
            pattern1(n-1, 0);
        }
    }

    static void pattern2(int n, int i, int j){
        if(i > n){
            return;
        }
        if(i <= j){
            System.out.print("*");
            pattern2(n,i+1,j);
        }else{
            System.out.println();
            pattern2(n, 0, j+1);
        }
    }
}

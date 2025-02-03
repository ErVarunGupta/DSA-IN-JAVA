package Recursion;

public class UnaryOperator {
    public static void main(String[] args) {
        unary(5);
    }

    static void unary(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        unary(--n);
    }

}

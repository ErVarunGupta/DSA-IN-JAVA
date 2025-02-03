package Recursion;
import static java.lang.Math.*;


public class ReverseOfNumber {
    public static void main(String[] args) {
        System.out.println(reverse2(12345));
    }

    static int reverse2(int n){
        int digit = (int)(log10(n)) + 1;
        return helper(n,digit);
    }
    static int helper(int n, int digit){
        if(n%10 == n){
           return n;
        }
        int rem = n%10;
        return rem * (int)pow(10, digit -1) + helper(n/10, digit-1);
    }
    static int reverse(int n,int rev){
        if(n%10 == 0) {
            return rev;
        }
        rev = rev*10 + n % 10;
        return reverse(n / 10, rev);
    }
}

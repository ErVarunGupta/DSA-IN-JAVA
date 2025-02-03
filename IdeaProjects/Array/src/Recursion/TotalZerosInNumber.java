package Recursion;

public class TotalZerosInNumber {
    public static void main(String[] args) {
        System.out.println(zeros(102003 , 0));
    }

    static int zeros(int n, int count){
        if(n%10 == n){
            return count;
        }
        int rem = n%10;
        if(rem == 0){
            return zeros(n/10,++count);
        }else{
            return zeros(n/10, count);
        }

    }
}

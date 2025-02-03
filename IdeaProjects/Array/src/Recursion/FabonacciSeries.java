package Recursion;

public class FabonacciSeries {
    public static void main(String[] args) {
       // fab(5);
        System.out.println(fabonacci(5));
    }
    static void fab(int n){
        int first = 1;
        int sec = 1;
        int i = 0;
        while( i < n){
            System.out.println(first);
            int third = first + sec;
            first = sec;
            sec = third;
            i++;
        }
    }
    static int fabonacci(int n){
        if(n < 2){
            return 1;
        }
        return fabonacci(n -1)  + fabonacci(n - 2);

    }
}

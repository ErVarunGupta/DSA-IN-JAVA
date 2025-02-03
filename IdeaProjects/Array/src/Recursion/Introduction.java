package Recursion;

public class Introduction {
    public static void main(String[] args) {
        introduction(5);
    }
    static void introduction(int n){
        if(n > 0) {
            //System.out.println(n);
            introduction(n - 1);
            System.out.println(n);
        }
    }
}

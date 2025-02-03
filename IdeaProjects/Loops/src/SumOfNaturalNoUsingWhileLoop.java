import java.util.Scanner;

public class SumOfNaturalNoUsingWhileLoop {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        while(num <= n){
            sum = sum + num;
            num ++ ;
        }
        System.out.println("Sum of natural number : "+ sum);
}
}

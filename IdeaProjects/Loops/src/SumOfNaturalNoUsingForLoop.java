import java.util.Scanner;

public class SumOfNaturalNoUsingForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        int num = 1;
        for( ; num <= n ; )
        {
            sum += num;
            num++;
        }
        System.out.println("Sum of natural number : " +sum);
    }
}

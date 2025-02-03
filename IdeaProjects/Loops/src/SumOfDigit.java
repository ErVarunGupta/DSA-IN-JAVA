import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        long num = sc.nextLong();
        long temp = num;
        int sum = 0;
        long digit = 0;
        while(num > 0)
        {
            digit = num%10;
            sum += digit;
            num /= 10;
        }
        System.out.println("Sum of "+temp + " is : "+sum);
    }
}

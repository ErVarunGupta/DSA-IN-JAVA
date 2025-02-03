//Add two numbers given in different base
import java.util.Scanner;

public class AddTwoDiffBaseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal value : ");
        int m = sc.nextInt();
        System.out.println("Enter the binary value : ");
        int n = sc.nextInt();
        int decimalnum = 0;
        int power = 1;
        while(n!=0){    //convert binary to decimal , and print the sum of the two decimal numbers.
            int rem = n % 2;
            decimalnum += rem * power;
            power *= 2;
            n /= 10;
        }
        System.out.println("Sum of given value : " +(m+decimalnum));
    }
}

import java.util.Scanner;

public class MulTwoDiffBaseNum {
    public static void main(String[] args){
        System.out.println("Enter the decimal value : ");
       Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the binari value : ");
        int n = sc.nextInt();
        int decnum = 0;
        int power = 1;
        while(n!= 0){   //convert binary number to decimal , and print the sum of the two numbers:
            int rem = n % 2;
            decnum += rem * power;
            power *= 2;
            n /= 10;
        }
        System.out.println("Mul of given number :" +(m*decnum));
    }

}

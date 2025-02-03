package Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int n = num;
        int sum = 0;

        while(num != 0){
            sum += num%10;
            num /= 10;
        }
        System.out.println("Sum of digits in "+n+" = "+sum);
    }
}

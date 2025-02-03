package Loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int factorial = 1;
        if(n < 0) {
            System.out.println("Factorial of negative number is not possible");
        }else if(n == 0){
            System.out.println("Factorial of 0 is 1");
        }else{
            while(n > 1){
                factorial *= n;
                n--;
            }
            System.out.println("Factorial of given number is "+factorial);
        }

    }
}

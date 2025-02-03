package Loops;

import java.util.Scanner;

public class Count_Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = sc.nextInt();
        int digit = 0;
        while(num != 0){
            num /= 10;
            digit++;
        }
        System.out.println("Total number of digits are "+digit);
    }
}

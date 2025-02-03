package Loops;

import java.util.Scanner;

public class ReverseOfNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        long  num = sc.nextInt();
        long  original_num = num;
        long reverse = 0;
        while(num != 0){
//            int digit = num%10;
//            reverse = reverse * 10 + digit;
            reverse = reverse * 10 + num%10;
            num /= 10;
        }
        System.out.println("Reverse of "+original_num+" is "+reverse);
    }
}

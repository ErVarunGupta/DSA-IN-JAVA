//Write a program to print a value if it is divisible by 3 or 5.
import java.util.Scanner;

public class divisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        if(num % 3 == 0 || num % 5 == 0){
            System.out.println("Found number is : " + num);
        }
    }
}

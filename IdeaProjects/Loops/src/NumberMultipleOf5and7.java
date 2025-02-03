//Print the first multiple of n which is also a multiple of m.
import java.util.Scanner;

public class NumberMultipleOf5and7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st multiple number : ");
        int n = sc.nextInt();
        System.out.println("Enter 2nd multiple number : ");
        int m = sc.nextInt();
        int num = 1;

        while(true){
            if(num%n == 0 && num%m == 0)
            {
                System.out.println("Fount number is : "+num);
                break;
            }
            num ++;
        }

    }
}

import java.util.Scanner;

public class TernaryCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        String ans = (num%2 == 0)? "Even" : "Odd";
        System.out.println(num+" is " +ans);
    }
}

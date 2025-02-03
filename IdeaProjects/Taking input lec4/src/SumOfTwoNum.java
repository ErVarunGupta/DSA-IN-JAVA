import java.util.Scanner;

public class SumOfTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int num_1 = sc.nextInt();

        System.out.println("Enter second number");
        int num_2 = sc.nextInt();
         int sum = num_1 + num_2;
          System.out.println("First number :"+num_1);
          System.out.println("Second number :"+num_2);
          System.out.println("Sum is :"+sum);
    }
}

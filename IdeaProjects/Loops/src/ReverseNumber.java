import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int reverse = 0;
        int temp = num;
        while(temp > 0)
        {
            reverse = reverse * 10 + temp%10;
            temp /= 10;
        }
        System.out.println("Reverse of "+num+ " is : "+reverse);
    }
}

import java.util.Scanner;

public class PowA_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number : ");
        int a = sc.nextInt();
        System.out.println("Enter the power number : ");
        int b = sc.nextInt();
        int ans = 1;
        for(int i = 1; i<=b ; i++)
        {
            ans *= a;
        }
        System.out.println("Answer is : "+ans);
    }
}

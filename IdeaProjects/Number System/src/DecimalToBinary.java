import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Decimal : ");
        long Dec_num = sc.nextLong();
        long temp = Dec_num;
        long Bin_num = 0;
        long pw = 1;
        while(Dec_num > 0)
        {
             Bin_num += pw * (Dec_num%2);
             Dec_num /= 2;
             pw *= 10;
        }
        System.out.println("Binary of "+temp+ " is : "+Bin_num);
    }
}

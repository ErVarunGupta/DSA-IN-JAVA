import java.util.Scanner;

public class DecimalToOctal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Decimal : ");
        long Dec_num = sc.nextLong();
        long temp = Dec_num;
        long Oct_num = 0;
        long pw = 1;
        while(Dec_num > 0)
        {
            Oct_num += pw * (Dec_num%8);
            Dec_num /= 8;
            pw *= 10;
        }
        System.out.println("Octal of "+temp+ " is : "+Oct_num);
    }
}


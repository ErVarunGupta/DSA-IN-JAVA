import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Binary number : ");
        int Bin_num = sc.nextInt();
        int Dec_num = 0;
        int pw = 1;
        while(Bin_num>0)
        {
            Dec_num += pw * Bin_num%10;
            Bin_num /= 10;
            pw *= 2;
        }
        System.out.println(Dec_num);
    }
}

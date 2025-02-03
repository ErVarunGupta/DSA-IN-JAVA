import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        long num = sc.nextLong();
        long temp = num;
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        System.out.println("Total digit of "+temp +" is : "+count);
    }
}

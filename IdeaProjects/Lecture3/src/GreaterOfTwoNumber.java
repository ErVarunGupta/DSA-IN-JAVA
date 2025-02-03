import java.util.Scanner;

public class GreaterOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int q ;
        int r ;
        if(a>b){
            System.out.println(a+" is greater");
            q = a/b;
            r = a - (b*q);
            System.out.println("Remainder is "+r);
        }
        else if(b>a){
            System.out.println(b+" is greater");
            q = b/a;
            r = b - (a*q);
            System.out.println("Remainder is "+r);
        }else{
            System.out.println("both are equal");

        }
        System.out.println(5%-2);
    }
}


import java.util.Scanner;


public class SimleInterest {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        float p = sc.nextFloat();

        System.out.print("Enter Rate : ");
        float r = sc.nextFloat();

        System.out.print("Enter Time : ");
        float t = sc.nextFloat();

        float SI = (p*r*t)/100;

        System.out.println("Principal is : "+p);
        System.out.println("Rate is : "+r);
        System.out.println("Time is : "+t);
        System.out.println("Simple Interest is : "+SI);
        

    }
}

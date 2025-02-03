import java.util.Scanner;

public class Piramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row : ");
        int r = sc.nextInt();
        for(int i = 1 ; i <= r ; i++)
        {
            for(int j = r-i ; j >= 0 ; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1 ; k <= 2*i-1 ; k++)
            {
                System.out.print("*");
            }
 //           System.out.println();
 //       }
 //       for(int l = r ; l>=1 ; l--)
 //       {
            for(int m = 1; m <= r-1 ; m++) {
                System.out.print(" ");
            }
            for(int n = 2*r-1; n>=1;n--)
            {
                System.out.print("*");
            }
           System.out.println();
       }


    }
}


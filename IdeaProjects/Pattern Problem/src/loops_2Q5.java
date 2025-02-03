import java.util.Scanner;

public class loops_2Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of row");
        int r = sc.nextInt();
        System.out.println("Enter the value of column");
        int c = sc.nextInt();
        for(int i = 1; i<=r; i++)
        {
            for(int j = 1; j<= c; j++)
            {
                if((i+j)%2 == 0)
                {
                    System.out.print(2);
                }
                else {
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }
}

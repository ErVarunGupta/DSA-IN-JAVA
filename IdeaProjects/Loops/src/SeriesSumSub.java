import java.util.Scanner;

public class SeriesSumSub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ; ");
        int num = sc.nextInt();
        int ans = 0;
        for(int i = 0; i<= num; i++)
        {
            if(i%2 == 0)
            {
                ans -= i;
            }
            else {
                ans += i;
            }

        }
        System.out.println("Answer of series : "+ans);

    }
}

import java.util.Scanner;

public class FabbonaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element : ");
        int num = sc.nextInt();
        int a = 1;
        int b = 1;
        for(int i = 1; i <= num; i++)
        {
            System.out.println(a+ " ");
            int sum = a+b; //calculating every 3rd element in series by sum
            a = b; //Update previous element to next element
            b = sum;//Update b to newly created next element

        }
    }
}

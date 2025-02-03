import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array : ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter value "+i+1 + ": ");
             arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i< arr.length ; i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array is : "+sum);
    }
}

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter the value "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements of array is : ");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

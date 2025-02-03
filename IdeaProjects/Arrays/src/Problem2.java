import java.util.Scanner;

// Calculate the maximum value out of all the elements in the array.
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for( int i = 0 ; i < n ; i++){
            System.out.print("Enter value "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        int max = 0;
        for(int i= 0; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.print("Maximum value of this array is : "+max);
    }
}

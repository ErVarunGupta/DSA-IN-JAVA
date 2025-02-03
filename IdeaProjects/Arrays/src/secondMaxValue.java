import java.util.Scanner;

public class secondMaxValue {

    static int findMax(int arr[]){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        return max;

    }
    static int secondMax(int arr[]){
        int max = findMax(arr);

        for(int i = 0; i < arr.length; i++){
            if(max == arr[i]){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.print("Enter the value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Second Maximum value is : "+secondMax(arr));
    }
}

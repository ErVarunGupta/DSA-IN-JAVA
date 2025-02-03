import java.util.Scanner;

public class ReverseArrays {

//    static int[] reverseArray(int arr[]){
//        int n = arr.length;
//        int ans[] = new int[n];
//        int j = 0;
//        // Traverse original array in reverse direction
//        for (int i = n-1; i >= 0; i--){
//           ans[j++] = arr[i];
//        }
//        return ans;
//    }

    static void swap(int arr[] , int i , int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }
    static int[] reverseArray(int arr[]){
        int n = arr.length;
        int left = 0 , right = n-1;
        while(left < right){
            swap(arr,left , right);
            left++;
            right--;
        }
        return arr;
    }
    static void printArray(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Original Array");
        printArray(arr);
        reverseArray(arr);
        System.out.println("Reverse Array");
        printArray(arr);


    }
}

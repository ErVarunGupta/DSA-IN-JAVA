//Rotate the array by 'k' steps without extra space

import java.util.Scanner;

public class RotateArrayInPlace {

    static void rotateArrayInPlace(int []arr , int k){
        int n = arr.length;
        k = k % n;
        reverse(arr , 0 , n-k-1);
        reverse(arr , n-k, n-1);
        reverse(arr, 0, n-1);
    }

    static void reverse(int[] arr , int left, int right){

        while(left < right){
            swap(arr , left , right);
            left++;
            right--;
        }
    }

    static void swap(int arr[] , int i , int j){
        arr[i] = arr[i] + arr[j];
        arr[j] = arr[i] - arr[j];
        arr[i] = arr[i] - arr[j];
    }

    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" elements");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k : ");
        int k = sc.nextInt();

        System.out.println("Original Array");
        printArray(arr);
        rotateArrayInPlace(arr , k);
        System.out.println("Array after rotation");
        printArray(arr);
    }
}

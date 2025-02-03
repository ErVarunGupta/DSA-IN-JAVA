package Recursion.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {4, 7, 30, 1, 9, 0};
        bubbleSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int arr[], int i, int e){
        if(e == 0){
            return;
        }
        if(i < e){
            if(arr[i] <= arr[i+1]){
                bubbleSort(arr, i+1, e);
            }else{
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                bubbleSort(arr,i+1, e);
            }
        }else{
            bubbleSort(arr, 0,e-1);
        }
    }
}

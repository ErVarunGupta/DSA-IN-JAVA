package Recursion.Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {14, 7, 3, 1, 9, 0};
      //  selectionSort(arr, arr.length,arr.length,arr[0]);
        selectionSort(arr, 0, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }

//    static void selectionSort(int arr[],int r, int c,int max){
//        if(r == 0){
//            return ;
//        }
//        if(c < r){
//            if(arr[c] > arr[max]){
//                selectionSort(arr, r, c+1, c);
//            }else{
//                selectionSort(arr, r, c+1, max);
//            }
//        }else{
//            int temp = arr[max];
//            arr[max]  = arr[r-1];
//            arr[r-1] = temp;
//            selectionSort(arr, r-1, 0, 0);
//        }
//    }

    static void selectionSort(int arr[], int s, int e, int max){
        if(e == 0){
            return;
        }
        if(s < e){
            if(arr[max] < arr[s+1]){
                selectionSort(arr,  s+1, e, s+1);
            }else{
                selectionSort(arr, s+1, e, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[e];
            arr[e] = temp;
            selectionSort(arr, 0, e-1, 0);
        }
    }

}

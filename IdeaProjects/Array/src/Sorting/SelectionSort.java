package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {4, 3, 6, 0, 2, 1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - 1 -i;
            int max = findMax(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static void selectionSort2(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int start = i;
            int min = findMin(arr, start, arr.length-1);
            swap(arr, i, min);
        }
    }

    static int findMax(int arr[], int start, int last){
        int max = start;
        for(int i = 0; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    static int findMin(int arr[], int start, int last){
        int min = start;
        for(int i = start; i <= last; i++){
            if(arr[i] < arr[min]){
                min = i;
            }
        }
        return min;
    }
}

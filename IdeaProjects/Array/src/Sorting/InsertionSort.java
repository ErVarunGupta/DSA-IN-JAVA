package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5, 4, 3, 2, 1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertionSort(int arr[]){
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < arr.length-1; i++){
            count1++;
            for(int j = i + 1; j > 0; j--){
                count2++;
                if(arr[j] >= arr[j-1]){
                    break;
                }else{
                    swap(arr,j,j-1);
                }
            }
        }
        System.out.println(count1+" "+count2);
    }
}

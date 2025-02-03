package Recursion.Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 7, 9, 13};
        int ans[] = mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] mergeSort(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int first[] = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int second[] = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(first, second);
    }

    static int[] merge(int first[], int second[]){
        int mix[] = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;

        }

        //It may be possible that one of the arrays is not completed
        //copy the ramaining elements

        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
}

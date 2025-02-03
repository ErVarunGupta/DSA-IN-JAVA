package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMissingNumber {
    public static void main(String[] args) {
        int arr[] = {2, 5, 3, 7,  6, 8, 2, 3};
        //System.out.println(Arrays.toString(allMissingNumber(arr)));
        System.out.println(allMissingNumber(arr));
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = arr[first];
    }

    static List<Integer> allMissingNumber(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i, correct);
            }else{
                i++;
            }
        }
        //find missing all elements in the array
        List<Integer> ans = new ArrayList<>();
        for(int index = 0; index < arr.length; index++){
            if(arr[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }
}

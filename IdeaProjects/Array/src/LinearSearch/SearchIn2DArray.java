package LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][]arr = {
                {12, 54, 0, 90, -1},
                {89, 45, 67, -4},
                {1, 3, 5},
                {9, 8, 4, 6}
        };
        int target = 67;
        int ans[] = searchIn2DArray(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    static int[] searchIn2DArray(int arr[][], int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

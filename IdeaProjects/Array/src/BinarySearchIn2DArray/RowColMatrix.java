package BinarySearchIn2DArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                {1,5,7,9},
                {4,8,10,12},
                {6,13, 15, 17},
                {11, 14, 16, 18}
        };
        int target = 151;
        System.out.println(Arrays.toString(rowColMatrix(arr,target)));
    }

    static int[] rowColMatrix(int arr[][], int target){
        int r = 0;
        int c = arr.length - 1;
        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r, c};
            }if(arr[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[] {-1, -1};
    }
}

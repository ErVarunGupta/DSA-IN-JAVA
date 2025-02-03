package BinarySearchIn2DArray;

import java.util.Arrays;

public class ContinuesRowColMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        int target = 1;
        System.out.println(Arrays.toString(search(matrix, target)));

    }

    static int binarySearch(int arr[], int target, int s, int e){
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] == target){
                return mid;
            }if(arr[mid] > target){
                e = mid - 1;
            }else{
                s = mid + 1;
            }
        }
        return -1;
    }

    static int[] search(int matrix[][], int target){
        int r = 0;
        int c = matrix[r].length-1;
        while(r >= 0 && c < matrix.length){
            if(matrix[r][c] == target){
                return new int[]{r, c};
            }if(matrix[r][c] < target){
                r++;
            }else{
                c = binarySearch(matrix[r], target, 0, matrix[r].length - 1);
            }
        }
        return new int[]{-1, -1};
    }

}

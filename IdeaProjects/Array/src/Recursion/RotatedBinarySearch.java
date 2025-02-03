package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int arr[] = { 6, 7, 8, 9, 1, 3, 5};
        int target = 1;
        System.out.println(rotatedBinarySearch(arr, target,0,arr.length-1));
    }

    static int rotatedBinarySearch(int arr[], int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(target == arr[m]){
            return m;
        }
        if(arr[s] < arr[m]){
            if(target >= arr[s] && target < arr[m]){
                return rotatedBinarySearch(arr, target, s, m - 1);
            }else{
                return rotatedBinarySearch(arr, target, m+1, e);
            }
        }
        if(target > arr[m] && target <= arr[e]){
           return rotatedBinarySearch(arr, target, m+1, e);
        }
          return   rotatedBinarySearch(arr, target, s, m-1);

    }
}

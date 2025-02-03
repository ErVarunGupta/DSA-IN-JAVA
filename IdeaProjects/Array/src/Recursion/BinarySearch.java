package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 6, 7, 20, 25};
        int target = 3;
        System.out.println(binarySearch(arr, target, 0, arr.length-1));
    }

    static int binarySearch(int []arr,int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e - s)/2;
        if(target == arr[m]){
            return m;
        }if(target > arr[m]){
            return binarySearch(arr, target, m + 1, e);
        }
        return binarySearch(arr, target, s, m - 1);
    }
}

package BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        //int arr[] = {1, 3, 4, 6, 9,10, 0, 2, 5, 7,11};
        int arr[] = { 3,1};
        int target = 1;
        System.out.println(mountenArray(arr,target));
    }

    static int mountenArray(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int pivot = arr.length-1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                pivot =  mid;
            }else if (mid > start && arr[mid] < arr[mid - 1]) {
               pivot = (mid - 1);
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }

        int ans = binarySearch(arr, target,0, pivot);
        if((ans == -1) && (pivot < end)){
            ans = binarySearch(arr, target, pivot + 1, arr.length-1);
        }
        return ans;
    }

    static int binarySearch(int arr[], int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

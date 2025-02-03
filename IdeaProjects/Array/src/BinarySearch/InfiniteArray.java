package BinarySearch;

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 6, 7, 9, 11, 12, 14, 17, 20, 27, 30};
        int target = 12;
        System.out.println(findingRange(arr, target));
    }

    static int findingRange(int arr[], int target){
        int ans = -1;
        //first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
            if(end > arr.length-1){
                end = arr.length-1;
            }
        }
        return binarySearch(arr, target, start, end);

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

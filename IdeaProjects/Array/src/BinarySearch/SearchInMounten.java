package BinarySearch;

public class SearchInMounten {
    public static void main(String[] args) {
        int arr[] = {0, 2, 23, 24, 26, 18, 9, 6, 2, 0};
        int target = 2;
        System.out.println(mountenArray(arr,target));
    }
    static int mountenArray(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid ;
            }else {
                start = mid + 1;
            }
        }
        //
        int ans = binarySearch(arr, target, end);
        if( ans == -1){
            ans = binarySearch2(arr, target, start);
        }
        return ans;
    }

    static int binarySearch(int arr[], int target, int e){

        int s = 0;

        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] > target){
                e = mid - 1;
            }else if(arr[mid] < target){
                s = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    static int binarySearch2(int arr[], int target, int s){

        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] < target){
                e = mid - 1;
            }else if(arr[mid] > target){
                s = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

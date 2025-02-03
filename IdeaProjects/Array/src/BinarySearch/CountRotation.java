package BinarySearch;

public class CountRotation {
    public static void main(String[] args) {
        int arr[] = { 3, 4, 7, 8, 9, 10,11};
        System.out.println(mountenArray(arr));
    }

    static int mountenArray(int arr[]) {
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

        return countRotation(arr, pivot);
    }

    static int countRotation(int arr[], int pivot){
        if(pivot+1 != arr.length){
            return pivot + 1;
        }
        return 0;
    }
}

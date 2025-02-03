package BinarySearch;

public class MountenArray {
    public static void main(String[] args) {
        int arr[] = {0, 1, 30, 26, 25, 18, 9, 6, 2, 0};
        System.out.println(mountenArray(arr));
    }
    static int mountenArray(int arr[]){
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
        return arr[start];
    }
}

package BinarySearch;

public class Main {
    public static void main(String[] args) {
        //int arr[] = {2,5,7,12,45,78,90};
        int arr[] = {90, 78, 12, 6, 5, 4, 2, 1};
        int target = 12;
        System.out.println(binarySearch2(arr,target));
    }

    //Ascending Order Binary Search
    static int binarySearch(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        int s = 0;
        int e = arr.length - 1;

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

    //Descending order binary search
    static int binarySearch2(int arr[], int target){
        if(arr.length == 0){
            return -1;
        }
        int s = 0;
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


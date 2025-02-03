package BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int arr[] = {2,4,4,4,4,4,4,5,5,5,6,7};
        int target = 4;

        System.out.println(Arrays.toString(search(arr, target)));
    }

    static int[] search(int arr[], int target){
        int ans[] = {-1, -1};
        ans[0] = firstAndLastPosition(arr,target, true);
        if(ans[0] != -1){
            ans[1] = firstAndLastPosition(arr, target, false);
        }
        return ans;
    }

    static int firstAndLastPosition(int arr[], int target, boolean findStartIndex){
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] < target){
                s = mid + 1;
            }else if(arr[mid] > target){
                e = mid - 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }
        }
        return ans;
    }
}

package BinarySearch;

public class SmallestLetter {
    public static void main(String[] args) {
        char arr[] = {'c', 'd', 'f', 'g'};
        char target = 'c';
        System.out.println(smallestLetter(arr, target));
    }

    static char smallestLetter(char []arr, char target){
        int s = 0;
        int e = arr.length-1;
        if(target >= arr[e]){
            return 0;
        }
        while(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] > target){
                e = mid - 1;
            }else {
                s = mid + 1;
            }
        }
        return arr[s];
    }
}

package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {
        int arr[] = {12, -1, 23, 45, 78, 32, 13, 67, 90};
        int target = 12;
        int min = 2;
        int max = 6;
        System.out.println(searchInRange(arr, target, min, max));
    }

    static int searchInRange(int arr[], int target, int min, int max){
        if(arr.length == 0){
            return -1;
        }
        for(int index = min; index < max; index++){
            if(arr[index] == target){
                return index;
            }
        }
        return -1;
    }
}

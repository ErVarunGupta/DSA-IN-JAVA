package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int arr[] = {12, 14, -1, 24, 45, 3, -4, 26};
        System.out.println(findMin(arr));
    }

    static int findMin(int arr[]){
        int min = arr[0];
        for(int element : arr){
            if(min > element) {
                min = element;
            }
        }
        return min;
    }
}

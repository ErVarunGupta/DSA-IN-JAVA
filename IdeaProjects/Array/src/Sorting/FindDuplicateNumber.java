package Sorting;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int arr[] = {3, 4, 4, 2, 5, 1};
        System.out.println(findDuplicateNumber(arr));
    }

    static void swap(int arr[], int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int findDuplicateNumber(int arr[]){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1){
                int correct = arr[i] - 1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }else{
                    //find duplicate number
                    return arr[i];
                }
            }else{
                i++;
            }
        }

        return -1;
    }
}

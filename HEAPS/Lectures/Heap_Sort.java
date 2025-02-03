package Lectures;

public class Heap_Sort {
    private static void heapify(int arr[], int i, int n){
        int maxIndx = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if(left < n && arr[maxIndx] < arr[left]){
            maxIndx = left;
        }
        if(right < n && arr[maxIndx] < arr[right]){
            maxIndx = right;
        }
        if(maxIndx != i){
            int temp = arr[maxIndx];
            arr[maxIndx] = arr[i];
            arr[i] = temp;

            heapify(arr,  maxIndx, n);
        }
    }

    public static void heapSort(int arr[]){     //O(n*logn)
        int n = arr.length;

        //build max heap
        for(int i = n/2; i >= 0; i--){
            heapify(arr, i , n);
        }

        //(delete from heap) push largest at end
        for(int i = n-1; i > 0; i--){
            //swap first with last
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapify(arr, 0, i);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 3};

        heapSort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

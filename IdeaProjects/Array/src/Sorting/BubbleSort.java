package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {6, 5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

//    static int swap(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//        return a b;
//    }

    static void bubbleSort(int arr[]){
        int flag = 0;
        int outerloop = 0;
        int innerloop = 0;
        for(int i = 0; i < arr.length-1; i++) {
            //outerloop++;
           // System.out.print(outerloop);
            for (int j = 0; j < arr.length -i -1; j++) {
//                innerloop++;
//                System.out.print(" "+innerloop);
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
                //System.out.println();
            }
            if (flag == 0) {
                System.out.println("Already Sorted");
                break;
            }

        }
        //System.out.println(outerloop+" "+innerloop);
    }
}

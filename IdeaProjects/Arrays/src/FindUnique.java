

import java.util.Scanner;

public class FindUnique {

    static void FindUnique(int arr[]){
       int n = arr.length;
       for(int i = 0; i < n; i++){
           for(int j = i+1; j < n; j++){
               if(arr[i] == arr[j]){
                   arr[i] = -1;
                   arr[j] = -1;
               }
           }
       }
       for(int i = 0; i < n; i++){
           if(arr[i] > 0){
               System.out.print("Unique number is : "+arr[i]);
           }
       }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i< n; i++){
            System.out.print("Enter value "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        FindUnique(arr);
    }
}

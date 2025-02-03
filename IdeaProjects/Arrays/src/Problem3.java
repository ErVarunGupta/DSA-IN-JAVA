import java.util.Scanner;

//Search if the given element x is present in the array or not and find the index . If not present then
// return the index as -1 (Linear search)
public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the value " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element which you want to find : ");
        int x= sc.nextInt();
        int index = -1;
        for(int i = 0 ; i < arr.length ; i++){
            if(x == arr[i]){
                index = i;
                break;
            }
        }
        System.out.println("Index of "+x +" is : "+(index));
    }
}
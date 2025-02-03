import java.util.Scanner;

public class TargetSum {
    static void pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){ // First number
            for(int j = (i+1); j < n; j++){ // Second number
                for(int k = j+1; k < n; k++) { //Third number
                    if (arr[i] + arr[j] + arr[k] == target) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]+" = "+target);
                        ans++;
                    }
                }
            }
        }

        System.out.println("Number of pair : "+ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter value "+(i+1)+" : ");
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter target sum : ");
        int target = sc.nextInt();

        //System.out.println("Number of pair : "+pairSum(arr , target));
        pairSum(arr , target);
    }
}

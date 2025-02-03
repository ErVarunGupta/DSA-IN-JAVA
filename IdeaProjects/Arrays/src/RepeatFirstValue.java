import java.util.Scanner;

public class RepeatFirstValue {

    static int repeatFirstValue(int arr[]){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n;j++){
                if(arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Enter value "+(i+1)+" : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("First repeat value is : "+repeatFirstValue(arr));
    }
}

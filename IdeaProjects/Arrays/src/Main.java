import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();

        int [][][]ar = new int[n][n][n];

        for (int i = 0; i < 4;i++){
            for(int j = 0; j < 4; i++) {
                for (int k = 0; k < 4; k++) {
                    System.out.print("Enter the value "+"(" + i+","+j+","+k + ")"+" into array : ");
                    ar[i][j][k] = sc.nextInt();
                }

            }
        }
        for(int i = 0; i< 4; i++){
            for(int j= 0 ; j < 4; j++){
                for(int k = 0; k < 4; k++){
                    System.out.print(ar[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
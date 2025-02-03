import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimention of row and column of 1st matrix : ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] A = new int[r1][c1];
        System.out.println("Enter elements into 1st matrix : ");
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                A[i][j] = sc.nextInt();
            }

        }
        System.out.println("Enter the dimention of row and column of 2nd matrix : ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int[][] B = new int[r2][c2];
        System.out.println("Enter the elements into 2nd matrix : ");
        for(int i = 0; i < r2; i++){
            for(int j = 0; j < c2; j++){
                B[i][j] = sc.nextInt();
            }

        }

        System.out.println("Matrix 1");
        printMatrix(A);
        System.out.println("Matrix 2");
        printMatrix(B);
        multiplicationMatrix(c1, c2, r1, r2, A, B);

    }
    static void printMatrix(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    static void multiplicationMatrix(int c1, int r2, int c2, int r1, int A[][], int B[][]){
        if(c1 != r2){
            System.out.println("Multiplication is not possible - Wrong input");
            return;
        }
        int C [][] = new int[r1][c2];
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c2; j++){
                for(int k = 0; k < c1; k++){
                    C[i][j] += (A[i][k] * B[k][j]);
                }
            }
        }
        System.out.println("Multiplication of matrices : ");
        printMatrix(C);
    }
}

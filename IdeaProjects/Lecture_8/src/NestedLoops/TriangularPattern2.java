package NestedLoops;

import java.util.Scanner;

public class TriangularPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows : ");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int k = 1; k <= r-i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++ ){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

package NestedLoops;

import java.util.Scanner;

public class NumericalRectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int r = sc.nextInt();
        //int c = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = i; j <= r; j++){
                System.out.print(j);
            }
            for(int k = 1; k <= i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

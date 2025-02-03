package NestedLoops;

import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns : ");
        int r = sc.nextInt();
        //int c = sc.nextInt();
        for(int i = 0; i < r; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

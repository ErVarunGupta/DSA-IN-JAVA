package NestedLoops;

import java.util.Scanner;

public class InvertTriangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
//        for(int i = r; i >= 1; i--){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < r-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package NestedLoops;

import java.util.Scanner;

public class RectangularPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int c = sc.nextInt();
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}

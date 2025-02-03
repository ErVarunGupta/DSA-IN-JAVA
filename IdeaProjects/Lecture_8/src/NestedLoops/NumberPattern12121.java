package NestedLoops;

import java.util.Scanner;

public class NumberPattern12121 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows and columns : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++)
            {
                System.out.print((i+j)%2+1);
            }
            System.out.println();
        }
    }
}

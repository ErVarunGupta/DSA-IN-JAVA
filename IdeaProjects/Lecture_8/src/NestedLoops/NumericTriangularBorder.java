package NestedLoops;

import java.util.Scanner;

public class NumericTriangularBorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows :: ");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= r-i; j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= 2*i-1; k++){
                if(k == 1||k == 2*i-1||i == r){
                    System.out.print(i);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

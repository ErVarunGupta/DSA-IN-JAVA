package Loops;

import java.util.Scanner;

// s = 1-2+3-4...n
public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++ ){
            if(i%2 == 0){
                sum -= i;
                if(i != n){
                    System.out.print(i+" + ");
                }else {
                    System.out.print(i+" = ");
                }
            }else {
                sum += i;
                if(i != n){
                    System.out.print(i+" - ");
                }else {
                    System.out.print(i+" = ");
                }
            }
        }
        System.out.print(sum);
    }
}

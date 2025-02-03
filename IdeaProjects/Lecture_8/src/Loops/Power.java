package Loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base value : ");
        int base = sc.nextInt();
        System.out.print("Enter power value : ");
        int power = sc.nextInt();
        int ans = 1;
        for(int i = 0; i < power; i++){
            ans *= base;
        }
        System.out.println("Value of "+base+"^"+power+" is "+ans);
    }
}

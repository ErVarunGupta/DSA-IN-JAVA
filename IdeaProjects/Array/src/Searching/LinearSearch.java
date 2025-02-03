package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size or array : ");
        int n = sc.nextInt();
        int data[] = new int[5];
        for(int i = 0; i < n; i++){
            System.out.print("Enter data "+(i+1)+" : ");
            data[i] = sc.nextInt();
        }
        System.out.print("Enter key which you want to search : ");
        int key = sc.nextInt();
        int flag = 0;
        for(int j = 0; j < n; j++){
            if(data[j] == key){
                System.out.print(key+" is placed at "+j+" index.");
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Key is not found");
        }
    }
}

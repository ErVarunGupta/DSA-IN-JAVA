package Stacks;

import java.util.Scanner;

public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingArray sua = new StackUsingArray();
        int arr[] = new int[5];
        int choice;
        do{
            System.out.print("\n0 : push\n 1 : pop\n 2 : display\n 3 : exit\n");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    sua.push(arr, sc);
                    break;
                case 1:
                    sua.pop(arr);
                    break;
                case 2:
                    sua.display(arr);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");

            }
        }while(true);
    }
    int top = -1;
    public void push(int arr[], Scanner sc){
        if(top == arr.length-1){
            System.out.println("Overflow");
            return;
        }
        System.out.print("Enter the data : ");
        top++;
        arr[top] = sc.nextInt();
    }

    public void pop(int arr[]){
        if(top == -1){
            System.out.println("Underflow");
            return;
        }
        System.out.print("Deleted data is : "+arr[top]);
        top--;
    }

    public void display(int arr[]){
        if(top == -1){
            System.out.println("Underflow");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i]+" ");
        }
    }
}

package Stacks;

import java.util.Scanner;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackUsingLinkedList sul = new StackUsingLinkedList();
        int choice;
        do{
            System.out.print("\n0 : push\n 1 : pop\n 2 : display\n 3 : exit\n");
            System.out.print("Enter choice : ");
            choice = sc.nextInt();
            switch (choice){
                case 0:
                    sul.push(sc);
                    break;
                case 1:
                    sul.pop();
                    break;
                case 2:
                    sul.display();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice!");

            }
        }while(true);
    }

    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    Node  head;

    public void push(Scanner sc){
        System.out.print("Enter data : ");
        int value = sc.nextInt();
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            newnode.next = null;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void pop(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        System.out.print("Deleted data is : "+head.value);
        head  = head.next;
    }

    public void display(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }
    }
}

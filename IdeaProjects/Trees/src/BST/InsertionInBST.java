package BST;

import java.util.Scanner;

public class InsertionInBST {
    private class Node{
        int value;
        Node left;
        Node right;
        int height;

        public Node(int value){
            this.value = value;
        }
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    Node root;

    public void insert(Scanner scanner){
        System.out.println("Enter the value of root : ");
        int value = scanner.nextInt();
        root  = new Node(value);
        while(true){
            System.out.print("Do you want to insert (y/n) : ");
            char choice = scanner.next().charAt(0);
            if(choice == 'n'){
                break;
            }
            System.out.print("Enter the value : ");
            int data = scanner.nextInt();
            insert(data, root);
        }
    }

    private Node insert( int data,Node node){
        if(node == null){
            node = new Node(data);
            return node;
        }
        if(data < node.value){
            node.left = insert(data, node.left);
        }
        if(data > node.value){
            node.right = insert(data, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right))+1;
        return node;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        if(node == null){
            return;
        }

        display(node.left);
        System.out.print(node.value+ "\t");
        display(node.right);
    }
}

package BinaryTree;

import java.util.Scanner;

public class InsertionLogic {
    private static class Node{
        int value;
        Node left;
        Node right;

       public Node(int value){
            this.value = value;
        }
    }

    Node root;

    public void populate(Scanner scanner){
        System.out.println("Enter the value of root : ");
        int value = scanner.nextInt();
        root  = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node){
        System.out.println("Do you want to insert left value of "+ node.value);
        char left = scanner.next().charAt(0);
        if(left == 'y'|| left == 'Y'){
            System.out.println("Enter the value of left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner,node.left);
        }
        System.out.println("Do you want to insert value in right of "+node.value);
        char right = scanner.next().charAt(0);
        if(right == 'y'|| right == 'Y'){
            System.out.println("Enter the right value of"+node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display(){
        display(this.root);
    }

    private void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+ "\t");
        display(root.left);
        display(root.right);
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);
    }
}

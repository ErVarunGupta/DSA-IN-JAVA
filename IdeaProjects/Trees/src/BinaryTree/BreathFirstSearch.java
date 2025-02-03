package BinaryTree;

import java.util.Scanner;
public class BreathFirstSearch {
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    Node root;

    public void insert(Scanner sc){
        System.out.println("Enter root : ");
        int value = sc.nextInt();
         root = new Node(value);
        insert(sc, root);
    }

    private void insert(Scanner sc, Node node){
        System.out.println("do you want to insert left : "+node.value);
        char left = sc.next().charAt(0);
        if(left == 'y'){
            System.out.print("Enter data : ");
            int data = sc.nextInt();
            node.left = new Node(data);
            insert(sc, node.left);
        }

        System.out.println("do you want to insert right : "+node.value);
        char right = sc.next().charAt(0);
        if(right == 'y'){
            System.out.print("Enter data : ");
            int data = sc.nextInt();
            node.right = new Node(data);
            insert(sc, node.right);
        }
    }

    public void display(){
        display(this.root);
    }

    private void display(Node node){
        if(node == null){
            return;
        }
        display(node.left);
        System.out.print(node.value+" ");
        display(node.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BreathFirstSearch bfs = new BreathFirstSearch();

        bfs.insert(sc);
        bfs.display();
    }

}

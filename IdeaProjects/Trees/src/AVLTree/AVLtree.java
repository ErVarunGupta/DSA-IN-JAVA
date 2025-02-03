package AVLTree;

import java.util.Scanner;

public class AVLtree {
    public class Node{
        int value;
        int height;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    Node root;
    public int height(){
        return height(root);
    }
    private int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }


    public void insert(Scanner scanner){

        while(true){
            System.out.print("Do you want to insert data(y/n) : ");
            char choice = scanner.next().charAt(0);
            if(choice == 'n'){
                break;
            }
            System.out.print("Enter the data : ");
            int data = scanner.nextInt();
            root = insert(data, root);
        }
    }

    private Node insert(int value, Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value,node.right);
        }
        node.height = Math.max(height(node.left), height(node.right))+1;

        return rotate(node);

    }

    public Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
            //left heavy
            if(height(node.left.left) - height(node.left.right) > 0){
                return rightRotate(node);
            }
            if(height(node.left.left) - height(node.left.right) < 0){
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(height(node.left) - height(node.right) < -1){
            //right heavy
            if(height(node.right.left) - height(node.right.right) > 0){
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
            if(height(node.right.left) - height(node.right.right) < 0){
                return leftRotate(node);
            }
        }
        return node;
    }

    public Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(p.left) , height(p.right)+1);
        c.height = Math.max(height(c.left) , height(c.right)+1);

        return c;
    }

    public Node leftRotate(Node p){
        Node c = p.right;
        Node t = c.left;

        c.left = p;
        p.right = t;

        p.height = Math.max(height(p.left), height(p.right) + 1);
        c.height  = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }

    public boolean isBalanced(){
        return isBalanced(this.root);
    }

    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
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

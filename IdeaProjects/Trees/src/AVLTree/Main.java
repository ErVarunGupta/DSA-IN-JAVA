package AVLTree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AVLtree avl = new AVLtree();

        avl.insert(scanner);
        avl.display();
        System.out.println("isBalanced : "+avl.isBalanced());
        System.out.println("Height is : "+avl.height());
        System.out.println("Root is : "+ avl.root.value);


    }
}

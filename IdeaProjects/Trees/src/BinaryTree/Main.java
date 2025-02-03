package BinaryTree;

import java.util.Scanner;

public class Main {

    //Binary tree
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InsertionLogic il = new InsertionLogic();
        il.populate(scanner);
        il.display();
        il.prettyDisplay();
    }
}

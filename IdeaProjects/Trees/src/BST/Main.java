package BST;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Logic logic = new Logic();
//        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        logic.populatedSorted(nums);
//        logic.display();

        Scanner scanner = new Scanner(System.in);
        InsertionInBST bst = new InsertionInBST();
        bst.insert(scanner);
        bst.display();
    }
}

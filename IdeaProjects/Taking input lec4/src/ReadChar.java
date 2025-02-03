//Program to read characters using Scanner class
import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character : ");
        String ch = sc.nextLine();
        System.out.println("Character is : "+ch);

        System.out.println("Enter index number : ");
        int index = sc.nextInt();
        //int char_num = index - 1;
        char chr = ch.charAt(index - 1);
        System.out.println("Character is : "+chr);

    }
}

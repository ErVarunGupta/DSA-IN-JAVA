package Strings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char arr[] = {'v', 'a', 'r', 'u', 'n'};
        String str = "Varun Kumar";
        String str2  = new String("abc@1234");

        //Strings are immutable

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter name ; ");
//        String name = sc.next();
//        Scanner sc1 = new Scanner(System.in);
//        System.out.print("Enter full name : ");
//        String fullName = sc1.nextLine();
//        System.out.println(name);
//        System.out.println(fullName);
//        System.out.println(fullName.length());

        //concatenation

        String firstName = "Varun";
        String lastName = "Kumar";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        System.out.println(fullName.charAt(0));
        printLetter(fullName);

    }

    public static void printLetter(String str){
        for(int i = 0; i < str.length(); i++){
            System.out.print(str.charAt(i));
        }
    }
}

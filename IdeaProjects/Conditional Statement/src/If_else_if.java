import java.util.Scanner;

//Write a program to divide people into 3 age groups deoending upon their age.
public class If_else_if {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = sc.nextInt();
        if(age <= 12){
            System.out.println("Your are child");
        }
        else if(age > 12 && age < 18){
            System.out.println("Your are teenager");
        }
        else{
            System.out.println("Your are adult");
        }
    }
}

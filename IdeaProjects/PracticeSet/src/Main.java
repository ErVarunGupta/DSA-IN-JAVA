import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int ch = 0;
    while(ch < 5) {
        System.out.println("1:- Addition");
        System.out.println("2:- Subtraction");
        System.out.println("3:- Multiplication");
        System.out.println("4:- Division");
        System.out.println("5:- For Exit");
        System.out.println("------------------");
        System.out.print("Enter your choice : ");
         ch = sc.nextInt();

        switch (ch) {
            case 1:
                sum();
                break;
            case 2:
                sub();
                break;
            case 3:
                mul();
                break;
            case 4:
                div();
                break;
            case 5:
                System.out.println("Exiting");
                break;
            default:
                System.out.println("Enter valid choice :");

            }
        }
    }
    static void getInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value : ");
        int a = sc.nextInt();
        System.out.print("Enter second value : ");
        int b = sc.nextInt();
    }
    static void sum(){
        getInput();
        int c = a + b;
        System.out.println("Sum = "+c);
    }
    static void sub(int a , int b){
        getInput();
        int c = a - b ;
        System.out.println("Subtarction = "+c);
    }
    static void mul(int a , int b){
        getInput();
        int c = a * b;
        System.out.println("Multilication = "+c);
    }
    static void div(int a, int b){
        getInput();
        int c = a / b;
        System.out.println("Division = "+c);
    }
}
import java.util.Scanner;

 class UnderAgeException extends RuntimeException {
    UnderAgeException(){
        super("You are not eligible for voting ..");
    }
    UnderAgeException(String message){
        super(message);
    }
}
class Voting{
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        System.out.println("Enter your age : ");
        int age = cs.nextInt();

        if(age < 18){
            throw new UnderAgeException();
        }
        else{
            System.out.println("You can vote now...!!");
        }



    }
}

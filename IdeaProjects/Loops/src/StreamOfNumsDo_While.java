import java.util.Scanner;

public class StreamOfNumsDo_While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int sum = 0;

        //using Do_while loop
//        do{
//            sum += num;
//            System.out.println("To calculate sum press -1,otherwise continue:");
//            num = sc.nextInt();
//        }while(num != -1);

        //Using while loop
//        while(num != -1){
//            sum += num;
//            System.out.println("To calculate sum press -1,otherwise continue:");
//            num = sc.nextInt();
//        }

        //Using For loop
        for(;num != -1 ; ){
            sum += num;
            System.out.println("To calculate sum press -1,otherwise continue:");
            num = sc.nextInt();
        }
        System.out.println("Sum of given value is : "+sum);
    }
}

import java.util.Scanner;

public class CommandLine {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int a, b, sum;
        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        sum = a + b;
        System.out.println("sum = "+ sum);
//        Varun v = new Varun();
//        v.anuj();
    }


}
//class Varun extends CommandLine{
//    Scanner s = new Scanner(System.in);
//    void anuj(){
//        int i = s.nextInt();
//        int arg[] = new int[i];
//        int sum = 0;
//        for(i = 0; i < arg.length; i++){
//            sum = sum + Integer.parseInt(String arg[i]);
//            System.out.println("sum = "+sum);
//        }
//    }
//}

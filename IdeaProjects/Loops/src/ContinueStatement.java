import java.util.Scanner;

public class ContinueStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1;
//        while(num <= 50)
//        {
//            if(num%3 == 0)
//            {
//                num++;
//                continue;
//            }
//            System.out.println(num);
//            num ++;
//        }
//        for(;num <= 50;num++)
//        {
//            if(num%3 == 0)
//            {
//                continue;
//            }
//            System.out.println(num);
//         }

        //Using labels with continue  and break keywords
        myloop : for(;num <= 50;num++)
        {
            if(num%3 == 0)
            {
                continue myloop;
            }
            System.out.println(num);
        }
    }
}

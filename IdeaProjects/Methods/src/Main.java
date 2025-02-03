import java.util.Scanner;

class Algebra{
    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
       Algebra obj = new Algebra();
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x and y :");
       int x = sc.nextInt();
       int y = sc.nextInt();

        System.out.println("Sum of input numbers: ");
        int ans = obj.add(x , y);
        System.out.println(ans);
    }
}
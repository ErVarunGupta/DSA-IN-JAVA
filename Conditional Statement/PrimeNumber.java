import static java.lang.Math.*;
public class PrimeNumber {
    public static void main(String[] args) {
        int a = 47;
        if(a == 3){
            System.out.println("true");
        }else{
            for(int i = 2; i <= sqrt(a); i++){
                if(a % i == 0){
                    System.out.println("false");
                    return;
                }
            }
            System.out.println("true");

        }
    }
}

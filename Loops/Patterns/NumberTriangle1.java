package Patterns;

public class NumberTriangle1 {
    public static void main(String[] args) {
        numberTriangle1(5);
    }

    static void numberTriangle1(int n){
        for(int  i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(j <= i){
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }
}

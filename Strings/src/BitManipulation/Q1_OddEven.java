package BitManipulation;

public class Q1_OddEven {
    public static void oddEvent(int num){
        int bitMask = 1;
        if((num & bitMask) == 1){
            System.out.println(num+" is odd");
        }else{
            System.out.println(num+" is even");
        }
    }

    public static void main(String[] args) {
        oddEvent(45);
    }
}

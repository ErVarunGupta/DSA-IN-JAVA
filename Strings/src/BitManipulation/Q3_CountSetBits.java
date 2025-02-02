package BitManipulation;

public class Q3_CountSetBits {
    public static void main(String[] args) {
        System.out.println(countSetBits(4));
    }
    public static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }


}

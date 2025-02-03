package BitManipulation;

public class Q2_ithBit {
    public static int getIthBit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i;
        return n|bitMask;
    }

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i , int newBit){
        if(newBit == 0){
            return clearIthBit(n,i);
        }else{
            return setIthBit(n,i);
        }
//         n = clearIthBit(n,i);
//         int BitMask = newBit<<i;
//         return n|BitMask;

    }

    public static int clearLastIthBit(int n, int i){
        int num =  n>>i;
        return num<<i;

    }

    public static int clearRange(int n, int i, int j){
        int a = ((~0)<<(j+1));
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(getIthBit(5,1));
        System.out.println(setIthBit(10,2));//10 = 1010, 1<<2 == 100, 1010|100 = 1110 = 14
        System.out.println(clearIthBit(10,1));// 10 = 1010, ~(1<<i) = ~(1<<1) = 1101, 1010 & 1101 = 1000 = 8
        System.out.println(updateIthBit(10,2,1));
        System.out.println(clearLastIthBit(15,2));
        System.out.println(clearRange(85,2,4));
    }
}

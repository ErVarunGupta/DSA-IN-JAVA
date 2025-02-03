package Part_2;

public class P13_FriendPairing {
    public static void main(String[] args) {
        System.out.println(friendPairing(4));
    }
    public static int friendPairing(int n){
        if (n == 1 || n == 2) {
            return n;
        }
        //for single
//        int fnm1 = friendPairing(n-1);
//        //for pairing
//        int fnm2 = friendPairing(n-2);
//        int totalWays = fnm1 + (n-1)*fnm2;
//        return totalWays;

        return friendPairing(n-1) + (n-1)*friendPairing(n-2);
    }
}

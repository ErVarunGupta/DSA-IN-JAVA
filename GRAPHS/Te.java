public class Te {

    static int function(int n){

        int count = 0;
        while(n != 0){
            n = n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int ans = function(31);
        System.out.println(ans);
    }
}

package Strings;

public class Q1_StringIsPalindrome {
    public static boolean isPalindrome(String str){
        String dummyStr = "";
        for(int i = str.length()-1; i >= 0; i--){
            dummyStr += str.charAt(i);
        }
        System.out.println(str);
        System.out.println(dummyStr);
        if(str.equals(dummyStr)){
            return true;
        }
        return false;

//        int start = 0;
//        int end = str.length()-1;
//        while(start <= end){
//            if(str.charAt(start) == str.charAt(end)){
//                start ++;
//                end --;
//            }else{
//                return false;
//            }
//        }
//        return true;

//        for(int i = 0; i < str.length()/2; i++){
//            if(str.charAt(i) != str.charAt(str.length()-i-1)){
//                return false;
//            }
//        }
//        return true;
    }

    public static void main(String[] args) {
        String name = "moon";
        System.out.println(isPalindrome(name));
    }
}

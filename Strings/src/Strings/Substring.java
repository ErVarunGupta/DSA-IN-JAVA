package Strings;

public class Substring {
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(substr(str,1,4));

        //built in function
        System.out.println(str.substring(1,4));
    }

    public static String substr(String str, int si, int ei){
        String substring = "";
        for(int i = si; i < ei; i++){
            substring += str.charAt(i);
        }
        return substring;
    }
}

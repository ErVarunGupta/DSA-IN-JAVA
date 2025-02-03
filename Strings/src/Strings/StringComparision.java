package Strings;

public class StringComparision {
    public static void main(String[] args) {
        String s1 = "Varun";
        String s2 = "Varun";
        String s3 = new String("Varun");

        if(s1 == s2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1 == s3){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}

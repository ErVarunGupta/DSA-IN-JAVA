package Strings;

public class Comparision {
    public static void main(String[] args) {
        String a = "Varun";
        String b = "Varun";

//        System.out.println( a == b);

        String name1 = new String("Varun");
        String name2 = new String("Varun");

//        System.out.println(name1 == name2);
        System.out.println(name1.equals(name2));
        System.out.println(name1.charAt(0));
    }
}

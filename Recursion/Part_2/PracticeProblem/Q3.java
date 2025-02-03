package Part_2.PracticeProblem;

public class Q3 {
    public static void main(String[] args) {
        System.out.println(lengthOfString("varungupta",0,0));
    }
    public static int lengthOfString(String str, int i, int length){
        if(str.length() == i){
           return length;
        }
        return lengthOfString(str,i+1,length+1);
    }
}

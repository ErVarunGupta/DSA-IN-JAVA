package Stack;
import java.util.Stack;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> ch = new Stack<>();
        int i = 0;
        while (i != str.length()){
            ch.push(str.charAt(i));
            i++;
        }

        //reverse
       StringBuilder result = new StringBuilder("");
        while (!ch.isEmpty()){
            result.append(ch.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String ans = reverse("Varun");
        System.out.println(ans);
    }

}

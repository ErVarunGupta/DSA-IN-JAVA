package Stack;
import java.util.Stack;
public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);

        while (!ss.isEmpty()){
            System.out.println(ss.peek());
            ss.pop();
        }
    }
}

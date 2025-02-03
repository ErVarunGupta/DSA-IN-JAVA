package Stack;

import java.util.Stack;

public class PushAtButtom {

    public static void pushAtButtom(Stack<Integer> s, int data){ //O(n)
        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtButtom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);

        pushAtButtom(ss, 4);
        while (!ss.isEmpty()){
            System.out.println(ss.pop());
        }
    }
}

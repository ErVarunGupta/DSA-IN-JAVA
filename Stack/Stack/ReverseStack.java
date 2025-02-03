package Stack;

import java.util.Stack;

import static Stack.PushAtButtom.pushAtButtom;

public class ReverseStack {
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtButtom(s,top);
    }

    public static void print(Stack<Integer> s){
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> ss  = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);

       // print(ss);
        reverseStack(ss);
        print(ss);
    }
}

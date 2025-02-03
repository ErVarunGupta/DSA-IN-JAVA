package Stack;
import java.util.ArrayList;
public class ArrayListStack {
    static class Stack{
        static ArrayList<Integer> stack = new ArrayList<>();

        //empty
        public static boolean isEmpty(){
            return stack.size() == 0;
        }

        //push
        public static void push(int data){
            stack.add(data);
        }

        //pop
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = stack.get(stack.size()-1);
            stack.remove(stack.size()-1);
            return top;
        }

        //peek
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return stack.get(stack.size()-1);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

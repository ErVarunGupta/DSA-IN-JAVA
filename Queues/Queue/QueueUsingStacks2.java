package Queue;

import java.util.Stack;

public class QueueUsingStacks2 {
    public static class Queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty(){
            return s1.isEmpty() && s2.isEmpty();
        }

        public static void add(int data){  //O(1)
            s1.push(data);
        }

        //remove
        public static void remove(){  //O(n)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return;
            }
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            s2.pop();
        }


        //peek
        public static int peek(){ //O(n)
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
            return s2.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

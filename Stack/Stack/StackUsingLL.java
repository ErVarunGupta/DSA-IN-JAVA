package Stack;

public class StackUsingLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static class Stack{
        public static Node head = null;

        //isEmpty
        public static boolean isEmpty(){
           return head == null;
        }

        //push
        public static void push(int data){
            Node newnode = new Node(data);
            if(isEmpty()){
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        //pop
        public static void pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return ;
            }
            System.out.println();
            head = head.next;
        }

        //peek
        public static Node peek(){
            return head;
        }
    }

    public static void main(String[] args) {
        Stack ss = new Stack();
        ss.push(1);
        ss.push(2);
        ss.push(3);

        while (!ss.isEmpty()){
            System.out.println(ss.peek().data);
            ss.pop();
        }
    }
}

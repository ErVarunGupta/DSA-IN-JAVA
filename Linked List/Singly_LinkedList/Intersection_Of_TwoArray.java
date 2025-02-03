package Singly_LinkedList;

 class Node{
    Object value;
    Node next;

    Node(Object value){
        this.value = value;
        this.next = null;
    }
}

public class Intersection_Of_TwoArray {

     static Node head1 = null;
     static Node head2 = null;

     public static void insert(int value1){
        Node node1 = new Node(value1);
        if(head1 == null){
            head1 = node1;
        }else{
            Node temp = head1;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node1;
        }
     }
    public static void insert1(int value2){
        Node node2 = new Node(value2);
        if(head2 == null){
            head2 = node2;
        }else{
            Node temp = head2;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node2;
        }
    }
     public static void print(){
         Node temp = head1;
         while(temp.next != null){
             System.out.print(temp.value+" -> ");
             temp = temp.next;
         }
         System.out.print("null");
     }
    public static void main(String[] args) {
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);

        print();
    }
}


package Singly_LinkedList;

public class RemoveCycle {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void insert (int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }

    public static void display(Node head){
        if(head == null){
            System.out.println("empty linked list");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static boolean detectCycle(Node head){
        if(head == null){
            System.out.println("no elements");
            return true;
        }
        Node slow = head;
        Node fast = head;
        Node temp = head;
        while(fast != null && fast.next != null){
            temp = slow;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(Node head){
        //detect cycle
        if(head == null){
            System.out.println("no elements");
            return;
        }
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                cycle = true;
                break;
            }
        }

        //find meeting point
       if(cycle){
           slow = head;
           Node prev = fast;
           while (slow != fast){
               prev = fast;
               slow = slow.next;
               fast = fast.next;
           }

           //remove cycle
           prev.next = null;
       }

    }


    public static void main(String[] args) {
//        insert(1);
//        insert(2);
//        insert(3);
//        insert(4);
//        insert(5);
        //display(head);

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        display(head);
        head.next.next.next.next = head.next;
        System.out.println(detectCycle(head));
        removeCycle(head);
        System.out.println(detectCycle(head));
        display(head);
    }
}

package LinkedList;

public class Palindrome {
    Node head;
    Node tail;
    int size = 0;
    public static void main(String[] args) {
        Palindrome bs = new Palindrome();
        bs.insertLast(3);
        bs.insertLast(1);
        bs.insertLast(7);
        bs.insertLast(4);
        bs.insertLast(1);
        bs.insertLast(3);

        bs.display();

        boolean ans = bs.palindrome();
        System.out.println(ans);

    }

    public void insertFirst(int value){
       Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            newnode.next = null;
        }
        if(tail == null){
            tail = head;
        }
        newnode.next = head;
        head = newnode;
        size++;
    }


    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node newnode = new Node(value);
        tail.next = newnode;
        newnode.next = null;
        tail = newnode;
        size++;
    }

    public void display(){
        if(head == null){
            System.out.println("no data present");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        int value;
        Node next;

        private Node(int value){
            this.value = value;
        }
        private Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    //Palindrome

    public boolean palindrome(){
        Node mid = middleNode(head);
        Node secondHead = reverse(mid);
        while(head != null && secondHead != null){
            if(head.value != secondHead.value){
                break;
            }
            head = head.next;
            secondHead = secondHead.next;
        }
        reverse(secondHead);
        return head == null || secondHead == null;
    }

    public Node middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        if(head == null){
            return null;
        }

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public Node reverse(Node head){
        if(head == null){
            return null;
        }
        Node prev = null;
        Node present = head;
        Node next1 = present.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next1;
            if(next1 != null){
                next1 = next1.next;
            }
        }
        return prev;
    }
}

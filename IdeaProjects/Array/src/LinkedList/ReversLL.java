package LinkedList;

import static java.lang.Math.abs;

public class ReversLL {
    public static void main(String[] args) {
        ReversLL bs = new ReversLL();
        bs.insertLast(3);
        bs.insertLast(1);
        bs.insertLast(7);
//        bs.insertLast(0);
//        bs.insertLast(4);
//        bs.insertLast(2);

        bs.display();
       bs.rotateList(2);
        bs.display();
    }

    Node head;
    Node tail;
    int size = 0;

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

    //Reverse of linked list

    public void reverse(){
        if(size < 2){
            return;
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
        head = prev;
    }

    public void reverseRange(int left, int right){
        Node prev = null;
        Node pres = head;
        Node next = pres.next;
        Node l = head;

        while(pres.value != left){
            l = pres;
            pres = pres.next;
        }
        Node r = pres;
        while(r.value != right){
            r = r.next;
        }
        l.next.next = r.next;
        l.next = r;

        while(pres.value != right){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next.value != right) {
                next = next.next;
            }
        }
        pres.next = prev;
    }


    //rotate

    public void rotateList(int k){
        if(head == null || head.next == null){
            return;
        }
        Node temp = head;
        Node tail = head;
        int size = 1;
        while(tail.next != null){
            size++;
            tail = tail.next;
        }
        for(int i = 1; i < size- k%size; i++){
           temp = temp.next;
        }

        tail.next = head;
        head = temp.next;
        temp.next = null;
    }


}

package LinkedList;

public class DLL {

    private Node head;
    private Node tail;

    private int size = 0;

    public void insertFirst(int value){
        Node newnode = new Node(value);
        if(tail == null){
            tail = head;
        }if(head != null) {
            head.prev = newnode;
        }
        newnode.next = head;
        newnode.prev = null;
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
        newnode.prev = tail;
        tail = newnode;
        newnode.next = null;
        size++;
    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newnode = new Node(value);
        newnode.next = temp.next;
        temp.next.prev = newnode;
        newnode.prev = temp;
        temp.next  = newnode;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("no any data exist in the list");
            return;
        }
        System.out.println(head.value+" is deleted");
        head = head.next;
        head.prev = null;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("no any data exist in the list");
            return;
        }
        System.out.println(tail.value+" is deleted");
        tail = tail.prev;
        tail.next = null;
        size--;
    }

    public void deleteIndex(int index){
        if(head == null){
            System.out.println("no any data exist in the list");
            return;
        }
        Node temp = head;
        for(int i = 1; i <= index; i++){
            temp = temp.next;
        }
        System.out.println(temp.value+" is deleted");
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
        size--;
    }

    public void display(){
        if(head == null){
            System.out.println("no any element exist in the list!");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse(){
        if(head == null){
            System.out.println("no any data exist in the list");
            return;
        }
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.value+" <- ");
            temp = temp.prev;
        }
        System.out.println("START");
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}

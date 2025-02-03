package LinkedList;

public class CLL {

    Node head = null;
    Node tail = null;

    int size = 0;

    public void insertFirst(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            newnode.next = head;
            tail = head;
        }
        tail.next = newnode;
        newnode.next = head;
        head = newnode;
        size++;
    }

    public void insertLast(int value){
        Node newnode = new Node(value);
        if(head == null){
            head = newnode;
            newnode.next = head;
            tail = head;
        }
        newnode.next = tail.next;
        tail.next = newnode;
        tail = newnode;
        size++;
    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }if(index == size){
            insertLast(value);
            return;
        }
        Node newnode = new Node(value);
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("no data");
            return;
        }
        System.out.println(head.value+" is deleted");
        head = head.next;
        tail.next = head;
        size--;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("no data");
            return;
        }
        System.out.println(tail.value);
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        tail = temp;
        temp.next = head;
        size--;
    }

    public void deleteAtIndex(int index){
        if(head == null){
            System.out.println("no data");
            return;
        }
        if(index == 0){
            deleteFirst();
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        System.out.println(temp.next.value+" is deleted");
        temp.next = temp.next.next;
        size--;

    }

    public void search(int key){
        if(head == null){
            System.out.println(" no any data exist in the list");
            return;
        }
        Node temp = head;
        int index = 0;
        while(temp.next != head){
            if(temp.value == key){
                System.out.println(index);
                return;
            }
            temp = temp.next;
            index++;
        }
        if(temp.value == key){
            System.out.println(index);
            return;
        }
        System.out.println("not found");
    }

    public void display(){
        Node temp = head;
        if(head == null){
            System.out.println("no any node present");
            return;
        }
        while(temp.next != head){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.print(temp.value+" -> ");
        System.out.println("HEAD");
    }
    private class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}

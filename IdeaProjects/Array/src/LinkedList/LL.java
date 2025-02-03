package LinkedList;

import org.w3c.dom.Node;

public class LL {
    private Node head;
    private Node tail;

    private int size;

    public LL(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node newnode = new Node(value);
//        newnode.value = value;
        newnode.next = head;
        head = newnode;
        if(tail == null){
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int value){
        if(tail == null){
            insertAtFirst(value);
            return;
        }
        Node newnode = new Node(value);
        tail.next = newnode;
        tail = newnode;
        newnode.next = null;

//        Node temp = head;
//        while(temp != null){
//            temp = temp.next;
//        }
//        Node newnode = new Node(value,temp.next);
//        temp = newnode;
        size++;
    }

    public void insertAtIndex(int value, int index){
        if(index == 0){
            insertAtFirst(value);
            return;
        }
        if(index == size){
            insertAtLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node newnode = new Node(value,temp.next);

        //newnode.next = temp.next;     we have already passed parameter and this parameter already set
        temp.next = newnode;
    }


    //insert using recursion
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }
        node.next = insertRec(value, index--, node.next);
        return node;
    }

    public void deleteAtFirst(){
        if(head == null){
            System.out.println("no element exist");
            return;
        }
        System.out.println(head.value+" is deleted");
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
    }

    public void deleteAtLast(){
        if(tail == null){
            System.out.println("no element exist");
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        System.out.println(tail.value+" is deleted");
        tail = temp;
        tail.next = null;
        size--;
    }

    public void deleteAtIndex(int index){
        if(index == 0){
            deleteAtFirst();
            return;
        }if(index == size){
            deleteAtLast();
            return;
        }
        Node temp = head;
        Node run = head;
        for(int i = 0; i < index; i++){
            run = temp;
            temp = temp.next;
        }
        System.out.println(temp.value+" is deleted");
        //temp.next = temp.next.next;
        run.next = temp.next;
        size--;
    }


    public void search(int key){
        int index = 0;
        if(head == null){
            System.out.println("no any element exist in the list");
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
            index++;
            if(temp.value == key){
                System.out.println(index);
                return;
            }
        }
        System.out.println("not found!");
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }


        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}

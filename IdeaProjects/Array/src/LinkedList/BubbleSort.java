package LinkedList;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        bs.insertLast(3);
        bs.insertLast(1);
        bs.insertLast(7);
        bs.insertLast(0);
        bs.insertLast(4);
        bs.insertLast(2);

        bs.display();
        bs.bubbleSort();
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

    //bubble sort

    public  void bubbleSort(){
        Node first = head;
        Node second = head;
        boolean flag = true;
        for(int i = size; i > 1; i--){
            for (int j = 1; j < i; j++){
                first = second;
                second = second.next;
                if(first.value > second.value){
                    int temp = first.value;
                    first.value = second.value;
                    second.value = temp;
                    flag = false;
                }

            }
            if(flag == true){
                break;
            }
            first = head;
            second = head;
        }
    }

    public void swap(int num1, int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
}

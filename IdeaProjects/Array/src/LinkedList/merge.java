package LinkedList;

public class merge {

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



    public void duplicateRemove(){
        Node temp = head;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
                size++;
            }else{
                temp = temp.next;
            }
        }
        tail = temp;
        tail.next = null;
    }

    public static merge mergeLists(merge first, merge second){
        Node temp1 = first.head;
        Node temp = second.head;

        merge ans = new merge();

        while(temp1 != null && temp != null){
            if(temp.value < temp1.value){
                ans.insertLast(temp.value);
                temp = temp.next;
            }else{
               ans.insertLast(temp1.value);
               temp1 = temp1.next;
            }
        }if(temp != null){
            ans.insertLast(temp.value);
            temp = temp.next;
        }if(temp1 != null){
            ans.insertLast(temp1.value);
            temp1 = temp1.next;
        }

        return ans;
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


    public static void main(String[] args) {
        merge first = new merge();
        merge second = new merge();
        first.insertLast(2);
        first.insertLast(4);
        first.insertLast(6);
        first.insertLast(6);
        first.insertLast(8);
        first.insertLast(10);
        first.insertLast(12);

        second.insertLast(1);
        second.insertLast(3);
        second.insertLast(5);
        second.insertLast(7);
        second.insertLast(9);
//        first.duplicateRemove();

        merge ans = merge.mergeLists(first, second);

        ans.display();

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
}

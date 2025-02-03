package Singly_LinkedList;

public class CreateLinkedList {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;

            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;


    public void addFirst(int data){  //O(1)
        // step1 = create new node
        Node newNode = new Node(data);
        if(head == null){  // if linkedlist is empty
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int index, int data){
        Node newNode = new Node(data);
        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        int i = 0;
        if(index == 0){
            addFirst(data);
            return;
        }
        while(i < index-1){
            if(temp == null){
                System.out.println("position out of bound");
                return;
            }
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display(Node head){

        if(head == null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }
        }

        while(head1 != null){
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }
    public Node mergeSort(Node head){
        //base condition
        if(head == null || head.next == null){
            return head;
        }

        // find mid
        Node mid = getMid(head);

        // recursive call for left half
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeftHead  = mergeSort(head);

        // recursive call for right half
        Node newRightHead = mergeSort(rightHead);

        // merging the  list
        return merge(newLeftHead,newRightHead);

    }

    //Zig-Zag LinkedList

    private Node reverseLL(Node head1){
        Node prev = null;
        Node curr = head1;
        Node next;

        while (curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public Node zig_zag(Node head){
        //find mid
        Node mid = getMid(head);

        //Reverse half Linked list
        Node RightHead = reverseLL(mid.next);
        mid.next = null;

        //alternate merging
        Node LeftHead = head;
        Node nextLeft;
        Node nextRight;

        while (RightHead != null && LeftHead != null){
            // convert into zig-zag
            nextLeft = LeftHead.next;
            LeftHead.next = RightHead;
            nextRight = RightHead.next;
            RightHead.next = nextLeft;

            //update LeftHead && RightHead
            LeftHead = nextLeft;
            RightHead = nextRight;
        }
        return head;
    }

    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
       // ll.addFirst(6);
        ll.addLast(7);
        ll.addLast(4);
        ll.addLast(8);
        ll.addLast(2);
        ll.addLast(1);

        ll.display(head);

        head = ll.mergeSort(head);
        ll.display(head);

        head = ll.zig_zag(head);
        ll.display(head);

    }

}

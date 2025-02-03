package Singly_LinkedList;

public class MergeSort {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // mid node
    }

    private Node merge(Node head1, Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
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
        return temp.next;
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




    public static void main(String[] args) {
        CreateLinkedList ll = new CreateLinkedList();
        ll.addLast(4);
        ll.addLast(3);
        ll.addLast(2);
        ll.addLast(1);

        ll.display(ll.head);


    }
}

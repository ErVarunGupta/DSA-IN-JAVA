package Singly_LinkedList;

public class LinkedList {
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

    public void display(){

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

    public int search(int key){
        int index = -1;
        if(head == null){
            System.out.println("Linked list is empty");
            return index;
        }
        Node temp = head;
        while(temp != null){
            index++;
            if(temp.data == key){
                return index;
            }
            temp = temp.next;
        }
        System.out.println("Key is not exist in this linked list");
        return -1;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Empty list");
            return;
        }
        if(head.next == null){
            head = tail = head.next;
            return;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
    }

    public void deleteMiddle(int index){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(index == 1){
            deleteFirst();
            return;
        }
        int i = 1;
        Node temp = head;
        while(i < index-1){
            if(temp.next == null){
                System.out.println("Index is out of bound");
                return;
            }
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    public int recursiveSearch(Node head, int count, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return count;
        }
       return recursiveSearch(head.next, count+1, key);
    }

    public void reverse(){ // O(n)
//        Node prev = null;
//        Node curr = head;
//        Node next = head.next;
//        while(curr.next != null){
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//            if(next.next != null){
//                next = next.next;
//            }
//        }
//        curr.next = prev;
//        prev = curr;
//       head = prev;

        //2nd approach
        Node prev  = null;
        Node curr = head;
        Node next = head;
        tail = head;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // reverse in range
    public void reverseInRange(int si, int ei){
        if(head == null || head.next == null){
            return;
        }
        Node left = head;
        Node right;
        Node prev = null;
        Node curr = head;
        Node next;

        //step1 - curr is reaching at si
        int i = 1;
        while(i < si){
            left = curr;
            curr = curr.next;
            i++;
        }
        right = curr;

        //step2 - reverse of given range
        while(i <= ei){
            next = curr.next;
            curr.next = prev;  // reverse step
            prev = curr;
            curr = next;
            i++;
        }

        //step3 - connecting reverse list to linked list
        if(si == 1){
            head = prev;
        }
        left.next = prev;
        right.next = curr;
    }

    public int size(){
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        return size;
    }


    public void removeNthNodeFromEnd(int count){
        int size = size();
        Node temp = head;
        //deleteMiddle(size-count+1);
        int nth = size-count+1;   // find nth node from left to right
        int i = 1;
        temp = head;
        if(nth == 1){  // if count == size ( first element should be delete)
           head = head.next;
            return;
        }
        while(i < nth-1){   // temp ko nth element se pahle rakhna hai
           temp = temp.next;
            i++;
        }
        tail = temp;
        temp.next = temp.next.next;
    }
    

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public boolean isPalindrom(){
        if(head == null || head.next == null){
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;  // right half head
        Node left = head;

        // step3 - check left half & right half
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    
    

//    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.addFirst(2);
//        ll.addFirst(1);
//        ll.addLast(3);
//        ll.addLast(6);
//        ll.addLast(7);
//        ll.addLast(8);
////        ll.addMiddle(4,50);
//        ll.display();
////        ll.deleteFirst();
////        ll.display();
////        ll.deleteLast();
////        ll.deleteMiddle(50);
////        ll.display();
//
////        int location = ll.search(20);
////        System.out.println(location);
//
////        int ans = ll.recursiveSearch(head,1,0);
////        System.out.println(ans);
//
////        ll.reverse();
////        ll.display();
//
////        ll.removeNthNodeFromEnd(5);
////        ll.display();
//
////        boolean ans = ll.isPalindrom();
////        System.out.println(ans);
//
//        ll.reverseInRange(6,6);
//        ll.display();
//    }


}

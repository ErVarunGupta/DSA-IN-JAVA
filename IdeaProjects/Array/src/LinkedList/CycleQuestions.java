package LinkedList;

public class CycleQuestions {
    //https://leetcode.com/problems/linked-list-cycle/submissions/1273105724/

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public int lengthOfCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               do{
                    length++;
                    slow  = slow.next;
                }while(slow != fast);
               return length;
            }
        }
        return 0;
    }

    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        int length = 0;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                length = lengthOfCycle(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        //find the start node
        ListNode f = head;
        ListNode s = head;

        while(length > 0){
            s = s.next;
            length--;
        }

        //keep moving both forward and they will meet at cycle start
        while(f != s){
            f = f.next;
            s = s.next;
        }
        return s;
    }
}

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }

      //happy number

    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        }while(slow != fast);
        if(slow == 1){
            return true;
        }
        return false;
    }

    private int findSquare(int number){
          int sum = 0;
          while(number > 0){
              int rem = number%10;
              sum = sum + rem*rem ;
              number /= 10;
          }
          return sum;
    }


    //Middle of linked list

//    public ListNode middleNode(ListNode head) {
//        int size = 0;
//        ListNode temp = head;
//        if(head == null){
//            return null;
//        }
//        do{
//            size++;
//            temp = temp.next;
//        }while(temp != null);
//        temp = head;
//
//        for(int i = 1; i <= size/2; i++){
//            temp = temp.next;
//        }
//
//        return temp;
//    }

    public ListNode middleNode(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;

          if(head == null){
              return null;
          }

          while(fast != null){
              slow = slow.next;
              fast = fast.next.next;
          }
          return slow;
    }
  }



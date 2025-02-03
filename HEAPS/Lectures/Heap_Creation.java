package Lectures;

import java.util.ArrayList;

public class Heap_Creation {
    static class Heap{
         ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data){      //O(logn)
            //add at last index
            arr.add(data);

            int x = arr.size()-1;       //x is a child index
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)){   //O(logn)
                //swap
                int temp = arr.get(x);          //temp = x
                arr.set(x, arr.get(par));   // x = par
                arr.set(par, temp);         //par = temp

                x = par;
                par = (x - 1)/2;
            }
        }

        private void heapify(int i){
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIndx = i;

            if(left < arr.size() && arr.get(minIndx) > arr.get(left)){
                minIndx = left;
            }
            if(right < arr.size() && arr.get(minIndx) > arr.get(right)){
                minIndx = right;
            }

            if(minIndx != i){
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIndx));
                arr.set(minIndx, temp);

                heapify(minIndx);
            }
        }

        public int remove(){        //O(logn)
            int data = arr.get(0);

            //swap first and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step 3 - heapify      O(logn)
            heapify(0);
            return data;
        }

        public int peek(){
            return arr.get(0);
        }

        public boolean isEmpty(){
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()){          //heap sort (nlogn)
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}

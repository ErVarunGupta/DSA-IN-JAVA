package Basics;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Top_View_Of_Tree {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Info{
        Node node;
        int hd;

        Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        //Level order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();  //Integer = hd, Node = node

        int min = 0, max = 0;
        q.add(new Info(root,0));
        q.add(null);        //for line change

        while (!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                if(!map.containsKey(curr.hd)){  //first time my hd is occurring
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);     //update min pointer
                }

                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);     //update max pointer
                }
            }
        }

        for(int i = min; i <= max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        /*
                    1
                   / \
                  2   3
                 / \ / \
                4  5 6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}

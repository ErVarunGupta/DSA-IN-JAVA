package Lectures;

public class Prefix_Problem {   //O(L) longest word
    static class Node{
        Node children[] = new Node[26];
        boolean endOfWord = false;
        int freq;

        Node(){
            for(int i = 0; i < 26; i++){
                this.children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    static void insert(String word){
        Node curr = root;
        for(int level = 0; level < word.length(); level++){
            int idx = word.charAt(level)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }else{
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }


    public static void findPrefix(Node root, String ans){
        if(root == null){
            return;
        }
        if(root.freq == 1){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < root.children.length; i++){
            if(root.children[i] != null){
                findPrefix(root.children[i], ans+(char)(i+'a'));
            }
        }
    }

    public static void main(String[] args) {
        String arr[] = {"zebra", "dog", "duch", "dove"};

        for(int i = 0; i < arr.length; i++){
            insert(arr[i]);
        }
        root.freq = -1;

        findPrefix(root, "");
    }
}

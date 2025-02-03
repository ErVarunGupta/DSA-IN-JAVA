package SegmentTree;

public class Main {
    public static void main(String[] args) {

        int arr[] = {5, 7, 1, -6, -4, 3, 8, 9};
        SegmentTree st = new SegmentTree(arr);

       st.display();
        System.out.println(st.query(0,3));

    }
}

package Implementation;

import java.util.HashSet;

public class Count_Distinct_Elements {
    static int distinct(int arr[]){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        System.out.println(distinct(arr));
    }
}

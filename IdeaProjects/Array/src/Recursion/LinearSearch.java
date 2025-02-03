package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {3, 5, 1,20, 7, 4, 13, 20, 45, 20};
        int target = 20;
        //System.out.println(linearSearch(arr, target, 0));

//        findAllIndex(arr,target,0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList<Integer> ans = findAllIndexList(arr,target,0, list);
//        System.out.println(ans);

        ArrayList<Integer> ans = findAllIndexList2(arr,target,0);
        System.out.println(ans);
    }

    static int linearSearch(int arr[] , int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return linearSearch(arr, target, index+1);
    }
    static ArrayList<Integer> list  = new ArrayList<>();
    static void findAllIndex(int arr[], int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
//            System.out.println(index);
            list.add(index);
        }
        findAllIndex(arr,target,index+1);
    }
    static ArrayList<Integer> findAllIndexList(int arr[], int target, int index ,ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
              list.add(index);
        }
        return findAllIndexList(arr,target,index+1, list);
    }

    // Array list without argument
    static ArrayList<Integer> findAllIndexList2(int arr[], int target, int index ){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer> finalList =  findAllIndexList2(arr,target,index+1);
         list.addAll(finalList);
         return list;

    }
}

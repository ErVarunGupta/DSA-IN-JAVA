package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int arr[] = {12, 14, -1, 24, 45, 3, -4, 26};
        int target = -1;
        System.out.println(linearSearch3(arr, target));
    }

    static boolean linearSearch3(int []arr, int target){
        if(arr.length == 0){
            return false;
        }
        for(int element: arr){
            if(element == target){
                return true;
            }
        }
        return false;
    }

    static int linearSearch2(int []arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for(int element: arr){
            if(element == target){
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }


    static int linearSearch(int []arr, int target){
        // if array has no elements return -1;
        if(arr.length == 0){
            return -1;
        }

        for(int index = 0; index < arr.length; index++){
            //check for element at every index if it is = target
            if(arr[index] == target){
                return index;
            }
        }
        // this line will execute if none of the return statement above have executed
        //hence the target not found
        return -1;
    }
}

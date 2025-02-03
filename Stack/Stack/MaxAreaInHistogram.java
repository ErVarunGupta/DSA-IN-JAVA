package Stack;

import java.util.Stack;

public class MaxAreaInHistogram { // O(n)
    public static int maxArea(int arr[]){
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        //next smaller right
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i >= 0; i--){  //O(n)
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i] = arr.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        //next smaller left
        for(int i = 0; i < arr.length; i++){ //O(n)
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i] = -1;
            }else{
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        //Current area : width = j - i - 1 = nsr[i] - nsl[i] - 1
        for(int i =0; i < arr.length; i++){ // O(n)
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int height[] = {2, 7, 5, 6, 2, 3};
        int result = maxArea(height);
        System.out.println("Max area of histogram : "+result);
    }
}

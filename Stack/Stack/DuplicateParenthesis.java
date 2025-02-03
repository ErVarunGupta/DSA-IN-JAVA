package Stack;

import java.util.Stack;

public class DuplicateParenthesis { // O(n)
    public static boolean duplicateParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            //closing
            if(ch == ')'){
                int count = 0;
//                while(s.peek() != '('){
//                    s.pop();
//                    count++;
//                }
//                if(count < 1){
//                    return true;
//                }else{
//                    s.pop();  // pop opening bracket
//                }

                while(s.pop() != '('){
                    count++;
                }if(count < 1){
                    return true;
                }
            }else{//opening
                s.push(ch);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean ans = duplicateParenthesis("((a+b))");
        System.out.println(ans);
    }
}

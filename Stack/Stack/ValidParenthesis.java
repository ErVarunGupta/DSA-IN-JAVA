package Stack;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean validParenthesis(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            if(curr == '(' || curr == '{' || curr == '['){
                s.push(curr);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((curr == ')' && '(' == s.peek()) || (curr == '}' && '{' == s.peek()) || (curr == ']' && '[' == s.peek())){
                    s.pop();
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        boolean ans = validParenthesis("]})");
        System.out.println(ans);
    }
}

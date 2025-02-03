package Strings.LeetCode;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        int n = s.length();
        char stack[] = new char[n];
        int top = -1;
        for(int i = 0; i < n; i++){
            if(top == -1){
                top++;
                stack[top] = s.charAt(i);
            }else if(isOpening(s.charAt(i))){
                top++;
                stack[top] = s.charAt(i);
            }else if(isMatching(stack[top],s.charAt(i))){
                top--;
            }else{
                return false;
            }
        }
        if(top == -1){
            return true;
        }
        return false;
    }

    public static boolean isOpening(char c){
        return c == '(' || c == '{' || c == '[';
    }

    public static boolean isMatching(char a, char b){
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }

}

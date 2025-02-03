package Strings.LeetCode;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String str[] = {"flower","flow","flight"};
        System.out.println(longestPrefix(str));
    }
    public static String longestPrefix(String str[]){
        Arrays.sort(str);
        String str1 = str[0];
        String str2 = str[str.length-1];
        StringBuilder sb = new StringBuilder("");
        int j = 0;
        // String newStr = "";
        while(j < str1.length()){
            if(str1.charAt(j) == str2.charAt(j)){
                // newStr += str1.charAt(j);
                sb.append(str1.charAt(j));
                j++;
            }else{
                break;
            }
        }
//        return j==0 ? "": str1.substring(0,j);
        return j==0 ? "": sb.toString();
    }
}

package Strings;
//"aaabbcccdd" = "a3b2c3d2"
public class Q5_StringCompression {
    public static String stringCompression(String str){ // O(n)
        StringBuilder sb = new StringBuilder("");

        for(int i = 0; i < str.length(); i++){
            Integer count = 1;
            sb.append(str.charAt(i));
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            if(count > 1){
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbccddd";
        System.out.println(stringCompression(str));
    }
}

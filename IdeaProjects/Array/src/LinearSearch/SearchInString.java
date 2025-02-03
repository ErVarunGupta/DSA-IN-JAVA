package LinearSearch;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Varun";
        char target = 'n';
        System.out.println(search(name, target));
    }

    static boolean search(String name, char target){
        if(name.length() == 0){
            return false;
        }
//        char arr[] = name.toCharArray();
//        for(char c = 0; c < name.length(); c++){
//            if(arr[c] == target){
//                return true;
//            }
//        }
        for(char ch: name.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}

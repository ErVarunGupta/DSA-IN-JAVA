package Part_2;

public class P14_BinaryString {
    public static void main(String[] args) {
        binaryString(3,0,""); //without consecutive 1
        //binaryString(3,1,""); // without consecutive 0
    }
    public static void binaryString(int n, int lastPlace, String str){
        if(n == 0){
            System.out.println(str);
            return;
        }

        //kaam
//        if(lastPlace == 0){
//            binaryString(n-1,0,str+"0");
//            binaryString(n-1,1,str+"1");
//        }else{
//            binaryString(n-1,0,str+"0");
//        }

        //without consecutive 1

        binaryString(n-1,0,str+"0");
        if(lastPlace == 0){
            binaryString(n-1,1,str+"1");
        }

        //without consecutive 0

//        binaryString(n-1,1,str+"1");
//        if(lastPlace == 1){
//            binaryString(n-1,0,str+"0");
//        }
    }
}

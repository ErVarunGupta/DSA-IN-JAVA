public class Test {

    void show(int a,int b){
        System.out.println("object method");
    }
    void show(int... d ){
        System.out.println("String method");
    }

//    void show(float a){
//        System.out.println("float method");
//    }

    public static void main(String[] args) {
        Test t= new Test();
        t.show(10,12,12);
    }

}

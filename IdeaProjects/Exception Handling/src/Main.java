public class Main {
    void m1(Main m){
        System.out.println("I am in  m1 method");
    }
    void m2(){
        m1(this);
    }
    public static void main(String[] args) {
        Main m = new Main();
        m.m2();
    }
}
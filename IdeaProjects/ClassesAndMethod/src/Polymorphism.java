public class Polymorphism {
    void show(){
 //       System.out.println("Show A");
  //      Polymorphism pm = new Polymorphism();
        show(7);
    }
     static void show(int a){
        System.out.println("show B");
        Polymorphism pm = new Polymorphism();


    }

    public static void main(String[] args) {
       Polymorphism pm = new Polymorphism();
        //pm.show('a');    // charecter automatic permote into integer
        //pm.show(24.5f);
        pm.main();
    }

    public static void main() {
        System.out.println("Main method");
        Polymorphism pm = new Polymorphism();
        pm.show();
    }
    Polymorphism(){
        System.out.println("Constructur call");
    }
}

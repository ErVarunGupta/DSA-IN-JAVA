public class Inheritance extends A {

    void primary(){
        System.out.println("Main class");
    }
    public static void main(String[] args) {

        //Animal an = new Animal();
//        an.eat();
        B obj1 = new B();
        //obj1.primary();
        //obj1.showA();
        obj1.showB();
        System.out.println("------------------");

        A obj2 = new A();

        //obj2.primary();
        obj2.showA();
        obj2.showB();
        System.out.println("-----------------------");

        Inheritance it = new Inheritance();
        it.primary();       //Single inheritance
        it.showA();           //Single inheritance
        it.showB();

    }

}

class A extends B{
    void showA() {
        System.out.println("Show A class");
    }
}

class B{
    void showB(){
        System.out.println("Show B class");
    }


}
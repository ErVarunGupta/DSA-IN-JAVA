import org.w3c.dom.ls.LSOutput;

public class StaticDemo {
//    String name;
//    int age;
//    StaticDemo(String name , int age){
//        this.name = name;
//        this.age = age;
    StaticDemo(int a){

        System.out.println("Ram Ram");
}
    public static void main(String[] args) {
//          StaticDemo td = new StaticDemo("Varun" , 20);
//          StaticDemo t = new StaticDemo("Priyanjali" , 19);
//        System.out.println(td.name+" "+td.age);
//        System.out.println(t.name+" "+t.age);
        StaticDemo t = new StaticDemo(10);

    }
}
class Name extends StaticDemo{
    StaticDemo st = new StaticDemo(10);

    Name(int a) {
        super(a);
        System.out.println("sita");
    }


}

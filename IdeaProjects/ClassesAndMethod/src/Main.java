
// Example of Hierarchical inheritance
public class Main {

    void showA(){
        System.out.println("Show A");
    }
    public static void main(String[] args) {
        Main sc = new Main();
        // We can call only showA Method in Main  Class object
        sc.showA();
        //sc.showBB();
        //sc.showCC();
        System.out.println("-------------");

        BB b = new BB();
        // We can call showA and showB Methods in BB  Class object
        b.showA();
        b.showB();
        //b.showCC();

        System.out.println("-------------");
        CC c = new CC();
        // We can call showA and showCC Methods in CC  Class object
        c.showA();
        //c.showB();
        c.showCC();

    }
}

class BB extends Main{
    void showB(){
        System.out.println("Show BB");
    }
}
class CC extends Main{
    void showCC(){
        System.out.println("Show CC");
    }
}
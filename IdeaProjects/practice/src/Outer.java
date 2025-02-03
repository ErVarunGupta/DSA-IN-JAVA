import org.w3c.dom.ls.LSOutput;

public class Outer {
    void method(){
        System.out.println("Jai Shri Ram");
    }
   static class Inner{
        void method(){
            System.out.println("Jai Maa Sarswati");
        }
       static class Inner2{
           void method2(){
               System.out.println("Inner2 class");
           }

       }

       class Inner3{
            void method3(){
                System.out.println("Inner3 class");
            }
       }
    }

    class InnerA{
        void methodB(){
            System.out.println("Jai Maa Sherawali");
        }
        static class InnerC{
            void methodC(){
                System.out.println("InnerC class");
            }
        }

        class InnerD{
            void methodD(){
                System.out.println("InnerD class");
            }
        }

    }

    public static void main(String[] args) {
        Outer o = new Outer();
        o.method();

        Outer.Inner oi = new Outer.Inner();
        oi.method();
        Outer.Inner.Inner2 oii = new Outer.Inner.Inner2();
        oii.method2();
        Outer.Inner.Inner3 oii5 = oi.new Inner3();
        oii5.method3();

        Outer.InnerA oi1 = o.new InnerA();
        oi1.methodB();
        Outer.InnerA.InnerC oii3 = new Outer.InnerA.InnerC();
        oii3.methodC();
        Outer.InnerA.InnerD oii4 = oi1.new InnerD();
        oii4.methodD();



    }
}

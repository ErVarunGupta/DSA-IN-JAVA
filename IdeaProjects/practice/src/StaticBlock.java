public class StaticBlock {
    static
    int a= 10;
    static{
        System.out.println("Ram Sita");
        System.out.println(a);
    }

    static void method(){
        System.out.println("Jai Shri Ram");
        System.out.println(a);
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        sb.method();
    }
}


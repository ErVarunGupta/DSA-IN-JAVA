public class Test {
    Test()
    {
        System.out.println("I'm in Test class");
    }
}
class Demo_ extends Test{
    Demo_()
    {
        super();

        System.out.println("I'm in Demo_ class");

    }

    public static void main(String[] args) {
        new Demo_();
        
    }
}

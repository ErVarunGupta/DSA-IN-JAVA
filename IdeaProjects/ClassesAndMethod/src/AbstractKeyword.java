public class AbstractKeyword {

}
abstract class Vehicle{
    abstract void start();
    void bike(){
        System.out.println("Bike Start with key");
    }
}
class car extends Vehicle{

    @Override
    void start() {
        System.out.println("Car start with key");
    }
}
class Scooter extends Vehicle{

    @Override
    void start() {
        System.out.println("Scooter start with kick");
    }

    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.bike();
        Scooter S = new Scooter();
        S.start();
        S.bike();
    }
}

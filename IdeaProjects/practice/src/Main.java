class Main{

    Main(Demo d){
        System.out.println("Maa Sherawali" );
    }


}
class Demo{
    Demo(){
        Main m  = new Main(this);
    }

    public static void main(String[] args) {
        new Demo();
    }
}
package Test;

import Demo.Test;

 class Inner extends Test {
    private void inMethod(){
        System.out.println("Inner Package");
    }

    public static void main(String[] args) {
        Inner in = new Inner();
        in.inMethod();
        Tone t = new Tone();
        t.temp();
2   345t
        in.show();
    }
}
class Tone{
     void temp(){
        System.out.println("Outside class");
    }
}

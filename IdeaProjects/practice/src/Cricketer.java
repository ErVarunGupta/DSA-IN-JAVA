 public class Cricketer {
     Cricketer() {
         System.out.println("Object is created");
     }
     protected void finalize(){
         System.out.println("Object is destroyed");
     }

     void cricketMethod()
     {
         System.out.println("cricketMethod");
     }

 }
 class Destroyed{

     public static void main(String[] args) {
         Cricketer c = new Cricketer();
         c = null;                          //nullifying object
         Cricketer c1 = new Cricketer();
         Cricketer c2 = new Cricketer();
         c1 = c2 ;                  // c1 is eligible for garbage collection
         System.gc();
        // c.cricketMethod();         //method call by c object
         c1.cricketMethod();        // method call by c1 object
         c2.cricketMethod();        // method call by c2 object
     }

}

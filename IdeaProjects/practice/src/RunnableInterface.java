import java.util.Scanner;

//public class RunnableInterface implements Runnable  {
//    public void run()
//    {
//        System.out.println("Thread task");
//    }
//
//
//}
//
//class ThreadClass extends Thread {
//    public void run() {
//        try {
//            for (int i = 2; i <= 6; i++) {
//                System.out.println("jai maa Sarswati");
//                sleep(1000);
//            }
//        }
//        catch(InterruptedException e)
//        {
//            System.out.println(e);
//        }
//        System.out.println("Thread task by ThreadClass");
//
//    }
//
//}
//
//class Thread2 extends Thread{
//    public void run(){
//        System.out.println("I am in thread2 class");
//    }
//}

class MainClass{
    public static void main(String[] args) {
//        RunnableInterface ri = new RunnableInterface();
//        Thread th = new Thread(ri);
//        th.start();
//        ThreadClass tc = new ThreadClass();
//        ThreadClass t = new ThreadClass();
//        t.start();
//        tc.start();
//        Thread2 td = new Thread2();
//        td.start();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the charecter: ");
        int i = sc.next().charAt(0);
        System.out.print("ASCII value of this charecter: "+i);
    }
}

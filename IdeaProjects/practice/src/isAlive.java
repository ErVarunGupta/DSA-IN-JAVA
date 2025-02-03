public class isAlive extends Thread {
    public void run()
    {
        System.out.println("jai maa sarswati");
        for(int i = 0; i <= 5 ; i++)
        {
            System.out.println("status : "+ isAlive());
        }
        System.out.println("Exit from thread1");
    }

}
class ThreadTest{
    public static void main(String[] args) {
        isAlive is = new isAlive();
        is.start();
        System.out.println("New status :"+ is.isAlive());

    }
}

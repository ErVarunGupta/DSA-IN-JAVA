
/* join() method:-
If thread wants to wait for another thread to complete its task , then we should use join() method.

methods:-
a.> public final void join() throws InterruptedException{----}
b.> punlic final synchronized void join(long ms) throws InterruptedException{----}
c.> public final synchronized void join(long ms , int ns) throws InterruptedException{----}
 */
//package threadjoindemo;

public class Join extends Thread {
    public void run()
    {
        try{
            for(int i = 1; i <= 5; i++){
                System.out.println("child thread : "+ i);
                Thread.sleep(1000);


            }
        }
        catch(Exception e )
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Join j = new Join();
        //j.run();               // By this call method , threads are not created.
        j.start();              // By this call method threads are created
        j.join();
        try {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println("main thread :" +i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}

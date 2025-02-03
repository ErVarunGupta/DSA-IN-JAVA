public class CreateThreadeUsingRunnableInterface implements Runnable{
    public void run(){
        System.out.println("Thread task");
    }

    public static void main(String[] args) {
        CreateThreadeUsingRunnableInterface ct = new CreateThreadeUsingRunnableInterface();
        Thread th = new Thread(ct);
        th.start();         // thread has been created
        th.run();           // thread can not be created

    }

}

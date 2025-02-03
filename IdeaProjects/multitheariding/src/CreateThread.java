public class CreateThread extends Thread{
    public void run(){
        System.out.println("create thread in run method");
    }

    public static void main(String[] args) {
        CreateThread ct = new CreateThread();
        ct.start();
        ct.run();
    }

}

package multithreading;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println(ThreadColor.ANSI_CYAN+"Hello from another thread..");

        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            System.out.println(ThreadColor.ANSI_BLUE+"Another thread woke me up");
            return;
        }

        System.out.println(ThreadColor.ANSI_RED+"Three seconds have passed..");
    }
}

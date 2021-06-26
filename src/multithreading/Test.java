package multithreading;

public class Test {
    public static void main(String[] args) {
        CountDownThread thread1 = new CountDownThread(new Countdown());
        thread1.setName("Thread1");
        CountDownThread thread2 = new CountDownThread(new Countdown());
        thread2.setName("Thread2");

        thread1.start();
        thread2.start();
    }
}

class Countdown{
    private int i;
    public void countDown(){
        String color;
        switch(Thread.currentThread().getName()){
            case "Thread1":
                color = ThreadColor.ANSI_CYAN;
                break;
            case "Thread2":
                color = ThreadColor.ANSI_PURPLE;
                break;
            default:
                color =ThreadColor.ANSI_RED;
        }
        for( i=10;i>=1;i--){

            System.out.println(color+Thread.currentThread().getName()+" :i= "+i);
        }
    }
}

class CountDownThread extends Thread{
    Countdown c;

    public CountDownThread(Countdown a) {
        c=a;
    }

    @Override
    public void run() {
        c.countDown();
    }
}

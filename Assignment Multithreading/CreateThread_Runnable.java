class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable thread running by " + Thread.currentThread().getName());
    }
}

public class CreateThread_Runnable {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}

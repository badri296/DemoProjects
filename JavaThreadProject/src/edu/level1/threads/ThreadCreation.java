package edu.level1.threads;

public class ThreadCreation {

    public static void main(String[] args) {
        Thread thread = new Thread(new Task());
        System.out.println("Hello World by User Thread");
        thread.start();
        System.out.println("JVM Shutting down now...");
    }

}

class Task implements Runnable {


    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World by User Child Thread");
    }
}

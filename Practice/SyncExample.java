class Counter {
    int count = 0;

    // synchronized method ensures only one thread can access it at a time
    synchronized void increment(String threadName) {
        for (int i = 1; i <= 5; i++) {
            count++;
            System.out.println(threadName + " incremented count to: " + count);
            try {
                Thread.sleep(500); // simulate delay
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread {
    Counter c;
    String threadName;

    MyThread(Counter c, String name) {
        this.c = c;
        this.threadName = name;
    }

    public void run() {
        c.increment(threadName);
    }
}

public class SyncExample {
    public static void main(String[] args) {
        Counter c = new Counter();

        MyThread t1 = new MyThread(c, "Thread 1");
        MyThread t2 = new MyThread(c, "Thread 2");

        t1.start();
        t2.start();
    }
}


// java SyncExample.java
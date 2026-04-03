class PriorityThread extends Thread {

    public PriorityThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running with priority " + getPriority());
    }
}

public class ThreadPrioritySystem {
    public static void main(String[] args) {

        // Creating threads
        PriorityThread t1 = new PriorityThread("Thread-1");
        PriorityThread t2 = new PriorityThread("Thread-2");
        PriorityThread t3 = new PriorityThread("Thread-3");

        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Starting threads
        t1.start();
        t2.start();
        t3.start();
    }
}

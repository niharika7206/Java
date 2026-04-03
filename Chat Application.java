class Sender extends Thread {

    public void run() {
        try {
            System.out.println("Sender Thread State: " + getState());

            System.out.println("Sending message...");
            Thread.sleep(1000); // simulate delay

        } catch (InterruptedException e) {
            System.out.println("Sender interrupted");
        }
    }
}

class Receiver extends Thread {

    public void run() {
        try {
            System.out.println("Receiver Thread State: " + getState());

            System.out.println("Receiving message...");
            Thread.sleep(1000); // simulate delay

        } catch (InterruptedException e) {
            System.out.println("Receiver interrupted");
        }
    }
}

public class ChatApplication {
    public static void main(String[] args) {

        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        // NEW state
        System.out.println("Before start - Sender: " + sender.getState());
        System.out.println("Before start - Receiver: " + receiver.getState());

        // Start threads → RUNNABLE
        sender.start();
        receiver.start();

        try {
            // WAITING for threads to finish → main thread enters WAITING
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        // TERMINATED state
        System.out.println("After execution - Sender: " + sender.getState());
        System.out.println("After execution - Receiver: " + receiver.getState());
    }
}

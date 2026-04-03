class PaymentThread extends Thread {

    public void run() {
        try {
            System.out.println("Processing payment...");
            Thread.sleep(1000); // simulate delay
        } catch (InterruptedException e) {
            System.out.println("Payment interrupted");
        }
    }
}

class OrderThread extends Thread {

    public void run() {
        try {
            Thread.sleep(1500); // ensure payment happens first (optional logic)
            System.out.println("Order confirmed...");
        } catch (InterruptedException e) {
            System.out.println("Order interrupted");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        PaymentThread payment = new PaymentThread();
        OrderThread order = new OrderThread();

        payment.start();
        order.start();
    }
}

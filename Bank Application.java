class BankApplication {

    // Method that throws exception
    public void processTransaction() throws Exception {
        // Simulating a condition (you can change this)
        boolean error = true;

        if (error) {
            throw new Exception("Transaction failed");
        }

        System.out.println("Transaction processed");
    }
}

public class Main {
    public static void main(String[] args) {

        BankApplication obj = new BankApplication();

        try {
            obj.processTransaction();
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}

class BankingSystem {

    private int balance = 1000;

    public void withdraw(String user, int amount) {

        // synchronized block for critical section
        synchronized (this) {

            System.out.println(user + " is trying to withdraw " + amount);

            if (balance >= amount) {
                try {
                    Thread.sleep(1000); // simulate processing delay
                } catch (InterruptedException e) {
                    System.out.println("Transaction interrupted");
                }

                balance -= amount;
                System.out.println(user + " deducted " + amount + 
                                   ", Remaining balance: " + balance);
            } else {
                System.out.println(user + ": Insufficient balance");
            }
        }
    }
}

// Thread class
class UserThread extends Thread {

    BankingSystem bank;
    String name;
    int amount;

    public UserThread(BankingSystem bank, String name, int amount) {
        this.bank = bank;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        bank.withdraw(name, amount);
    }
}

public class Main {
    public static void main(String[] args) {

        BankingSystem bank = new BankingSystem();

        // Multiple users accessing same account
        UserThread t1 = new UserThread(bank, "User1", 700);
        UserThread t2 = new UserThread(bank, "User2", 500);

        t1.start();
        t2.start();
    }
}

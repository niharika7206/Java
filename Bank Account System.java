import java.util.Scanner;

class Account {
    int acc_no;
    String name;
    double amount;
    void createAccount(int acc_no, String name, double amount) {
        this.acc_no = acc_no;
        this.name = name;
        this.amount = amount;
    }
    void deposit(double depositAmount) {
        amount = amount + depositAmount;
        System.out.println("Amount deposited: " + depositAmount);
    }
    void withdraw(double withdrawAmount) {
        if (withdrawAmount > amount) {
            System.out.println("Insufficient balance!");
        } else {
            amount = amount - withdrawAmount;
            System.out.println("Amount withdrawn: " + withdrawAmount);
        }
    }
    void check_balance() {
        System.out.println("Current balance: " + amount);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account a1 = new Account();

        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        System.out.print("Enter initial amount: ");
        double amount = sc.nextDouble();

        a1.createAccount(accNo, name, amount);

        System.out.print("Enter amount to deposit: ");
        double dep = sc.nextDouble();
        a1.deposit(dep);

        System.out.print("Enter amount to withdraw: ");
        double wd = sc.nextDouble();
        a1.withdraw(wd);

        a1.check_balance();

        sc.close();
    }
}

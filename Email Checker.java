import java.util.Scanner;

public class EmailChk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input email
        System.out.print("Enter email: ");
        String email = sc.nextLine();

        // Check condition
        if (email.contains("@gmail.com")) {
            System.out.println("Valid Gmail Address");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}

import java.util.Scanner;

public class MessageFormatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first and last name
        System.out.print("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter last name: ");
        String lastName = sc.nextLine();

        // Concatenate with space
        String fullName = firstName + " " + lastName;

        // Display result
        System.out.println("Full Name: " + fullName);

        sc.close();
    }
}

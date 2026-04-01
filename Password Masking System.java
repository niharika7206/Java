import java.util.Scanner;

public class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input password
        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Mask all characters except last two
        if (password.length() > 2) {
            String maskedPart = password.substring(0, password.length() - 2)
                                        .replaceAll(".", "*");
            String visiblePart = password.substring(password.length() - 2);
            String maskedPassword = maskedPart + visiblePart;

            System.out.println("Masked Password: " + maskedPassword);
        } else {
            System.out.println("Password too short to mask");
        }

        sc.close();
    }
}

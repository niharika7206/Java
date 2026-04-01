import java.util.Scanner;

public class NameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input names
        System.out.print("Enter first name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter second name: ");
        String name2 = sc.nextLine();

        // Case-sensitive comparison
        if (name1.equals(name2)) {
            System.out.println("Names are equal (case-sensitive)");
        } else {
            System.out.println("Names are not equal (case-sensitive)");
        }

        sc.close();
    }
}

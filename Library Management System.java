import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {

    public static void main(String[] args) {

        ArrayList<String> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n1 Add Book");
            System.out.println("2 View Books");
            System.out.println("3 Remove Book");
            System.out.println("4 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter book name: ");
                String book = sc.nextLine();
                books.add(book);

            } else if (choice == 2) {
                for (String b : books) {
                    System.out.println(b);
                }

            } else if (choice == 3) {
                System.out.print("Enter book name to remove: ");
                String book = sc.nextLine();
                books.remove(book);

            } else {
                break;
            }
        }
    }
}

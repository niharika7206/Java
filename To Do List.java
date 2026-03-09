import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] tasks = new String[3];

        for (int i = 0; i < 3; i++) {
            tasks[i] = sc.nextLine();
        }

        System.out.println("Your Tasks:");
        for (String t : tasks)
            System.out.println(t);
    }
}

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1 Add Student");
            System.out.println("2 View Students");
            System.out.println("3 Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter name: ");
                String name = sc.nextLine();

                System.out.print("Enter marks: ");
                int marks = sc.nextInt();

                students.add(new Student(name, marks));

            } else if (choice == 2) {
                for (Student s : students) {
                    System.out.println(s.name + " : " + s.marks);
                }

            } else {
                break;
            }
        }
    }
}

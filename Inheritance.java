#Topic: Inheritance (Parent → Child class)
import java.util.Scanner;
class Person {
    String name;
    int age;

    void getPersonData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void showPersonData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int roll;
    String course;

    void getStudentData(int roll, String course) {
        this.roll = roll;
        this.course = course;
    }

    void showStudentData() {
        showPersonData(); 
        System.out.println("Roll Number: " + roll);
        System.out.println("Course: " + course);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter course: ");
        String course = sc.nextLine();

        s1.getPersonData(name, age);
        s1.getStudentData(roll, course);

        System.out.println("\n--- Student Details ---");
        s1.showStudentData();

        sc.close();
    }
}

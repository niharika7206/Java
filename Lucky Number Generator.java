import java.util.Scanner;

public class LuckyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num == 7 || num == 9)
            System.out.println("Lucky Number!");
        else
            System.out.println("Try again");
    }
}

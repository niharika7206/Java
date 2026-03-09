import java.util.Scanner;

public class QuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "Capital of India?",
                "5 + 3 = ?",
                "Java is developed by?"
        };

        String[] answers = {
                "delhi",
                "8",
                "sun"
        };

        int score = 0;

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            String user = sc.nextLine().toLowerCase();

            if (user.equals(answers[i])) {
                score++;
            }
        }

        System.out.println("Score: " + score);
    }
}

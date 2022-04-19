package hexlet.code;

import java.util.Scanner;

public final class GameEngine {
    public static final int CORRECT_ANSWER_TO_WIN_COUNT = 3;

    public static void play(String description, String[][] questionAnswerPairs) {
        System.out.println("Welcome to the Brain Games!");
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String userName = scanner.next();

        System.out.println(description);

        for (String[] question : questionAnswerPairs) {
            String questionText = question[0];
            String correctAnswer = question[1];
            System.out.println("Question: " + questionText);
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (correctAnswer.equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + userName + "!");
    }
}

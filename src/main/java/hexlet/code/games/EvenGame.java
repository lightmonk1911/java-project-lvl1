package hexlet.code.games;

import java.util.Scanner;

import hexlet.code.Cli;

public class EvenGame {
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int CORRECT_ANSWER_TO_WIN_COUNT = 3;
    private static final int MAX_NUMBER = 100;

    private static void showDescription() {
        System.out.println(DESCRIPTION);
    }

    private static void showLoseMessage(String correctAnswer, String answer, String name) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        System.out.println("Let's try again, " + name + "!");
    }

    private static void showWinMessage(String name) {
        System.out.println("Congratulations, " + name);
    }

    public static void play() {
        Cli.welcome();
        String userName = Cli.askName();
        Cli.greet(userName);

        showDescription();

        Scanner scanner = new Scanner(System.in);
        int correctAnswersCount = 0;

        while (correctAnswersCount < CORRECT_ANSWER_TO_WIN_COUNT) {
            int nextNumber = (int) (Math.random() * MAX_NUMBER);
            System.out.println("Question: " + nextNumber);
            System.out.print("Your answer: ");
            String correctAnswer = nextNumber % 2 == 0 ? "yes" : "no";
            String answer = scanner.next();

            if (answer.equals(correctAnswer)) {
                correctAnswersCount++;
            } else {
                showLoseMessage(correctAnswer, answer, userName);
                return;
            }
        }

        showWinMessage(userName);
    }
}

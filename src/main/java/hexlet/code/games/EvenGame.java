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
                Cli.showIncorrectAnswer(correctAnswer, answer, userName);
                return;
            }
        }

        Cli.congratulate(userName);
    }
}

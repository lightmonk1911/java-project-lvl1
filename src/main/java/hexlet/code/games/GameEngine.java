package hexlet.code.games;

import java.util.Scanner;

public final class GameEngine {
    private static final int CORRECT_ANSWER_TO_WIN_COUNT = 3;
    private final Game game;
    private final String userName;

    public GameEngine(Game selectedGame, String name) {
        this.game = selectedGame;
        this.userName = name;
    }

    private static void showLoseMessage(String correctAnswer, String answer, String userName) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        System.out.println("Let's try again, " + userName + "!");
    }

    private static void showWinMessage(String userName) {
        System.out.println("Congratulations, " + userName + "!");
    }

    private void showDescription() {
        System.out.println(game.getDescription());
    }

    public void play() {
        showDescription();

        Scanner scanner = new Scanner(System.in);
        int correctAnswersCount = 0;

        while (correctAnswersCount < CORRECT_ANSWER_TO_WIN_COUNT) {
            Question question = game.nextQuestion();

            System.out.println("Question: " + question.getQuestion());
            System.out.print("Your answer: ");
            String answer = scanner.next();

            if (question.isAnswerCorrect(answer)) {
                correctAnswersCount++;
                System.out.println("Correct!");
            } else {
                showLoseMessage(question.getAnswer(), answer, userName);
                return;
            }
        }

        showWinMessage(userName);
    }
}

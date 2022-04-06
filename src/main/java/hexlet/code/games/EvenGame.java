package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public final class EvenGame {
    public static final String KEY = "Even";
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    private static String[] nextQuestion() {
        int number = Utils.randomInt(MAX_NUMBER);
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    public static void play() {
        String[][] questions = new String[GameEngine.CORRECT_ANSWER_TO_WIN_COUNT][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = nextQuestion();
        }

        GameEngine.play(DESCRIPTION, questions);
    }
}

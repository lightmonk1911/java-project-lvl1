package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public final class GCDGame {
    public static final String KEY = "GCD";

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 30;

    private static int getGCD(int n1, int n2) {
        int bigger = Math.max(n1, n2);
        int smaller = Math.min(n1, n2);
        int divisor = smaller;

        if (bigger % divisor == 0) {
            return divisor;
        }

        divisor /= 2;

        while (divisor > 1) {
            if (bigger % divisor == 0 && smaller % divisor == 0) {
                return divisor;
            }

            divisor--;
        }

        return divisor;
    }

    private static String[] nextQuestion() {
        int first = Utils.randomInt(1, MAX_NUMBER);
        int second = Utils.randomInt(1, MAX_NUMBER);

        int divisor = getGCD(first, second);

        String questionText = first + " " + second;
        String answer = String.valueOf(divisor);

        return new String[]{questionText, answer};
    }

    public static void play() {
        String[][] questions = new String[GameEngine.CORRECT_ANSWER_TO_WIN_COUNT][2];

        for (int i = 0; i < questions.length; i++) {
            questions[i] = nextQuestion();
        }

        GameEngine.play(DESCRIPTION, questions);
    }
}

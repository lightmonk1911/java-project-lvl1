package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public final class PrimeGame {
    public static final String KEY = "Prime";
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    private static String[] nextQuestionAnswerPair() {
        int number = Utils.randomNatural(MAX_NUMBER);
        String correctAnswer = isPrime(number) ? "yes" : "no";
        return new String[]{String.valueOf(number), correctAnswer};
    }

    public static void play() {
        String[][] questionAnswerPairs = new String[GameEngine.CORRECT_ANSWER_TO_WIN_COUNT][2];

        for (int i = 0; i < questionAnswerPairs.length; i++) {
            questionAnswerPairs[i] = nextQuestionAnswerPair();
        }

        GameEngine.play(DESCRIPTION, questionAnswerPairs);
    }
}

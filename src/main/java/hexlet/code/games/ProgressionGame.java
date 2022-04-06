package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public final class ProgressionGame {
    public static final String KEY = "Progression";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 15;
    private static final int MAX_STEP = 9;
    private static final int MIN_STEP = 1;
    private static final int MAX_SEED = 50;
    private static final String DESCRIPTION = "What number is missing in the progression?";

    private static String[] nextQuestion() {
        int length = Utils.randomInt(MIN_LENGTH, MAX_LENGTH);
        String[] progression = new String[length];

        int seed = Utils.randomInt(MAX_SEED);
        int step = Utils.randomInt(MIN_STEP, MAX_STEP);
        int indexOfHidden = Utils.randomInt(length);

        String answer = null;
        for (int i = 0; i < length; i++) {
            int member = seed + i * step;
            if (i == indexOfHidden) {
                answer = String.valueOf(member);
                progression[i] = "..";
            } else {
                progression[i] = String.valueOf(member);
            }
        }

        String questionText = String.join(" ", progression);

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

package hexlet.code.games;

import hexlet.code.GameEngine;
import hexlet.code.Utils;

public final class CalcGame {
    public static final String KEY = "Calc";

    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int MAX_NUMBER = 10;

    private static String[] nextQuestionAnswerPair() {
        int operatorIndex = Utils.randomInt(OPERATORS.length);
        String operator = OPERATORS[operatorIndex];
        int left = Utils.randomInt(MAX_NUMBER);
        int right = Utils.randomInt(MAX_NUMBER);

        String question = left + " " + operator + " " + right;
        String answer = switch (operator) {
            case ("+") -> String.valueOf(left + right);
            case ("-") -> String.valueOf(left - right);
            case ("*") -> String.valueOf(left * right);
            default -> throw new RuntimeException("Unknown operator: '" + operator + "'");
        };

        return new String[]{question, answer};
    }

    public static void play() {
        String[][] questionAnswerPairs = new String[GameEngine.CORRECT_ANSWER_TO_WIN_COUNT][2];

        for (int i = 0; i < questionAnswerPairs.length; i++) {
            questionAnswerPairs[i] = nextQuestionAnswerPair();
        }

        GameEngine.play(DESCRIPTION, questionAnswerPairs);
    }
}

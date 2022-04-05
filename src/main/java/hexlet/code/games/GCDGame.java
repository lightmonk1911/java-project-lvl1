package hexlet.code.games;

public final class GCDGame implements Game {
    public static final String KEY = "GCD";

    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 30;

    private int getGCD(int n1, int n2) {
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

    @Override
    public Question nextQuestion() {
        int first = (int) (Math.random() * MAX_NUMBER);
        int second = (int) (Math.random() * MAX_NUMBER);

        int GCD = getGCD(first, second);

        String questionText = first + " " + second;
        String answer = String.valueOf(GCD);

        return new Question(questionText, answer);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
package hexlet.code.games;

public final class PrimeGame implements Game {
    public static final String KEY = "Prime";
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    private boolean isPrime(int n) {
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    @Override
    public Question nextQuestion() {
        int number = (int) (Math.random() * MAX_NUMBER);
        String correctAnswer = isPrime(number) ? "yes" : "no";
        return new Question(String.valueOf(number), correctAnswer);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

package hexlet.code.games;

public final class EvenGame implements Game {
    public static final String KEY = "Even";
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    @Override
    public Question nextQuestion() {
        int number = (int) (Math.random() * MAX_NUMBER);
        String correctAnswer = number % 2 == 0 ? "yes" : "no";
        return new Question(String.valueOf(number), correctAnswer);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

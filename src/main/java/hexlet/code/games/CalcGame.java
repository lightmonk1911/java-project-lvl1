package hexlet.code.games;

public final class CalcGame implements Game {
    public static final String KEY = "Calc";

    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[] OPERATORS = {"+", "-", "*"};
    private static final int MAX_NUMBER = 100;

    @Override
    public Question nextQuestion() {
        int operatorIndex = (int) (Math.random() * 2);
        String operator = OPERATORS[operatorIndex];
        int left = (int) (Math.random() * MAX_NUMBER);
        int right = (int) (Math.random() * MAX_NUMBER);

        String question = left + " " + operator + " " + right;
        String answer;

        switch (operator) {
            case ("+"):
                answer = String.valueOf(left + right);
                break;
            case ("-"):
                answer = String.valueOf(left - right);
                break;
            case ("*"):
                answer = String.valueOf(left * right);
                break;
            default:
                return null;
        }

        return new Question(question, answer);
    }

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}

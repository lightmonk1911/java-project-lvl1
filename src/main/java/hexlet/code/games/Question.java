package hexlet.code.games;

import java.util.Objects;

public final class Question {
    private String question;

    public String getQuestion() {
        return question;
    }

    private String answer;

    public String getAnswer() {
        return answer;
    }

    public boolean isAnswerCorrect(String userAnswer) {
        return Objects.equals(userAnswer, this.answer);
    }

    public Question(String question, String answer) {
        this.answer = answer;
        this.question = question;
    }
}

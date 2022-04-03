package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void welcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    public static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.next();
        return name;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static void showIncorrectAnswer(String correctAnswer, String answer, String name) {
        System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        System.out.println("Let's try again, " + name + "!");
    }

    public static void congratulate(String name) {
        System.out.println("Congratulations, " + name);
    }
}

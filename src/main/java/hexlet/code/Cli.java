package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static void welcome() {
        System.out.println("Welcome to the Brain Games!");
    }

    private static String askName() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.next();
        return name;
    }

    private static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    public static String meetUser() {
        welcome();
        String name = askName();
        greet(name);
        return name;
    }
}

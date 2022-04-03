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
}

package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.EvenGame;
import hexlet.code.games.Greet;

public class App {
    private static final String[] GAMES = {"Greet", "Even"};

    public static void showMenu() {
        System.out.println("Please enter the game number and press Enter.");

        for (int i = 0; i < GAMES.length; i++) {
            System.out.println((i + 1) + " - " + GAMES[i]);
        }

        System.out.println("0 - Exit");
    }

    public static String askUserToSelectGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your choice: ");
        int gameNumber = scanner.nextInt();

        if (gameNumber == 0) {
            return "Exit";
        }

        return GAMES[gameNumber - 1];
    }

    public static void main(String[] args) {
        showMenu();
        String game = askUserToSelectGame();

        switch (game) {
            case ("Greet") -> Greet.play();
            case ("Even") -> EvenGame.play();
            default -> {

            }
        }
    }
}

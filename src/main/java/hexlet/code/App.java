package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.CalcGame;
import hexlet.code.games.EvenGame;
import hexlet.code.games.Game;
import hexlet.code.games.GameEngine;

public class App {
    private static final String GREET_KEY = "Greet";
    private static final String[] GAMES = {GREET_KEY, EvenGame.KEY, CalcGame.KEY};

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
            return null;
        }

        return GAMES[gameNumber - 1];
    }

    public static void main(String[] args) {
        showMenu();
        String gameKey = askUserToSelectGame();

        if (gameKey == null) {
            return;
        }

        Game game;
        switch (gameKey) {
            case (EvenGame.KEY) -> {
                game = new EvenGame();
            }

            case (CalcGame.KEY) -> {
                game = new CalcGame();
            }

            case (GREET_KEY) -> {
                Cli.meetUser();
                return;
            }
            default -> {
                return;
            }
        }

        String userName = Cli.meetUser();
        GameEngine gameEngine = new GameEngine(game, userName);
        gameEngine.play();
    }
}

// PlayerFactory.java
import java.util.Scanner;

public class PlayerFactory {
    private static int botCounter = 1;

    public static Player createPlayer(int playerNumber, Scanner scanner) {
        System.out.print("Is player " + playerNumber + " a human or bot? ");
        String type = scanner.next().toLowerCase();
        char marker = (char) ('A' + playerNumber - 1);

        if (type.equals("human")) {
            System.out.print("Enter name for player " + playerNumber + ": ");
            String name = scanner.next();
            return new HumanPlayer(name, marker, scanner);
        } else {
            String botName = "Bot" + botCounter++;
            System.out.println("[INFO] Assigned name " + botName + " to player " + playerNumber);
            return new BotPlayer(botName, marker);
        }
    }
}

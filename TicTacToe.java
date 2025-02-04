// TicTacToe.java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter board size (n): ");
        int boardSize = scanner.nextInt();
        System.out.print("Enter number of players (max " + (boardSize - 1) + "): ");
        int numPlayers = scanner.nextInt();

        List<Player> players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(PlayerFactory.createPlayer(i, scanner));
        }

        new GameManager(boardSize, players).startGame();
    }
}

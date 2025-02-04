// GameManager.java
import java.util.List;
import java.util.Scanner;

public class GameManager {
    private final Board board;
    private final List<Player> players;
    private int currentPlayerIndex = 0;

    public GameManager(int size, List<Player> players) {
        this.board = new Board(size);
        this.players = players;
    }

    public void startGame() {
        System.out.println("Starting the game...");
        board.display();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println(currentPlayer.getName() + "'s turn (" + currentPlayer.getMarker() + "):");
            int[] move = currentPlayer.makeMove(board, scanner);
            board.update(move[0], move[1], currentPlayer.getMarker());
            board.display();

            if (board.checkWin(currentPlayer.getMarker())) {
                System.out.println(currentPlayer.getName() + " wins!");
                break;
            } else if (board.isFull()) {
                System.out.println("It's a draw!");
                break;
            }

            currentPlayerIndex = (currentPlayerIndex + 1) % players.size();
        }

        scanner.close();
    }
}

// HumanMoveStrategy.java
import java.util.Scanner;

public class HumanStrategy implements MoveStrategy {
    @Override
    public int[] makeMove(Board board, Scanner scanner) {
        int row, col;
        while (true) {
            System.out.print("Enter your move (row col): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (board.isCellEmpty(row, col)) break;
            System.out.println("Cell already occupied. Try again.");
        }
        return new int[]{row, col};
    }
}

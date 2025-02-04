import java.util.Scanner;

public interface MoveStrategy {
    int[] makeMove(Board board, Scanner scanner);
}

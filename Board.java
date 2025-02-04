// Board.java
import java.util.Arrays;
import java.util.stream.IntStream;

public class Board {
    private final char[][] grid;

    public Board(int size) {
        grid = new char[size][size];
        for (char[] row : grid) Arrays.fill(row, '_');
    }

    public void display() {
        for (char[] row : grid) {
            for (char cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }

    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == '_';
    }

    public void update(int row, int col, char marker) {
        grid[row][col] = marker;
    }

    public boolean isFull() {
        return Arrays.stream(grid).flatMapToInt(row -> IntStream.range(0, row.length).map(col -> row[col])).noneMatch(cell -> cell == '_');
    }

    public boolean checkWin(char marker) {
        // Simple win-check logic (rows, cols, diagonals)
        return false;
    }

    public int getSize() {
        return grid.length;
    }
}

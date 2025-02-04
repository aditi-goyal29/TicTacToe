import java.util.Scanner;

// Player.java
public abstract class Player {
    protected String name;
    protected char marker;
    protected MoveStrategy moveStrategy;

    public Player(String name, char marker, MoveStrategy moveStrategy) {
        this.name = name;
        this.marker = marker;
        this.moveStrategy = moveStrategy;
    }

    public String getName() {
        return name;
    }

    public char getMarker() {
        return marker;
    }

    public int[] makeMove(Board board, Scanner scanner) {
        return moveStrategy.makeMove(board, scanner);
    }
}

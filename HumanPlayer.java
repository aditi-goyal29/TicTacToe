// HumanPlayer.java
import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(String name, char marker, Scanner scanner) {
        super(name, marker, new HumanStrategy());
    }
}

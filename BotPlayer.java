// BotPlayer.java
public class BotPlayer extends Player {
    public BotPlayer(String name, char marker) {
        super(name, marker, new BotStrategy());
    }
}

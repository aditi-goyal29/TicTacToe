import java.util.Random;
import java.util.Scanner;

public class BotStrategy implements MoveStrategy{
    private Random random=new Random();

    @Override
    public int[] makeMove(Board board, Scanner scanner) {
        int row,col;
        do{
            row=random.nextInt(board.getSize());
            col=random.nextInt(board.getSize());
        }while(!board.isCellEmpty(row,col));
        System.out.println("Bot Chose move:  "+row+" "+col);
        return new int[]{row,col};

    }

}

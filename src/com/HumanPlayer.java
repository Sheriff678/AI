
import java.util.Scanner;
public class HumanPlayer extends Player
{

    public HumanPlayer(String name, char letter)
    {
        super(name, letter);
    }

    @Override
    public Move getMove(Board board)
    {
        Scanner input = new Scanner(System.in);
        boolean valid;
        Move move = null;

        do
        {
            System.out.print("\nEnter row: ");
            int row = input.nextInt();
            System.out.print("\nEnter column: ");
            int col = input.nextInt();
            System.out.print("\n");

            if((row < 0 || row > 7) || (col < 0 || col > 7))
            {
                System.out.println("Invalid move \nTry again.");
                valid = false;
            }

            else
            {
                move = new Move(col, row);

                if(!board.isFull(move))
                    valid = true;

                else
                {
                    valid = false;
                    System.out.println("Invalid move \nTry again.");
                }
            }



        }while(!valid);

        return move;
    }

    @Override
    public Player freshCopy()
    {
        return new HumanPlayer(getName(), getLetter());
    }
}

public class RandomComputer extends Player
{
    public RandomComputer(String name, char letter)
    {
        super(name, letter);
    }

    @Override
    public Move getMove(Board board)
    {
        boolean valid;
        Move move;
        do
        {
            int row = (int)(Math.random()*8);
            int col = (int)(Math.random()*8);

            System.out.print("\nEnter row: "+row);
            System.out.print("\nEnter column: "+col);
            System.out.print("\n");

            move = new Move(row, col);
            if(!board.isFull(move))
                valid = true;
            else
                valid = false;

        }while(!valid);
        return move;
    }

    public Move firstMove(Board board)
    {
        boolean valid;
        Move move;
        do
        {
            int row = (int)(Math.random()*8);
            int col = (int)(Math.random()*8);

            move = new Move(row, col);
            if(!board.isFull(move))
                valid = true;
            else
                valid = false;

        }while(!valid);
        return move;
    }

    @Override
    public Player freshCopy()
    {
        return new RandomComputer(getName(), getLetter());
    }
}

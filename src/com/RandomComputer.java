package com;


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

            move = new Move(row, col);

            if(!board.isFull(move) && board.isEmpty(move))
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

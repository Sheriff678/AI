package com;
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

        Move move;

        do
        {
            System.out.print("Enter coordinates (row col): ");
            int row = input.nextInt();
            int col = input.nextInt();

            move = new Move(row, col);

            if(!board.isFull(move) && board.isEmpty(move))
                valid = true;

            else
            {
                valid = false;
                System.out.println("Invalid mov. Try again.");
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

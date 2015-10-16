package edu.indiana.cs.c212.players;

import java.util.List;
import java.util.Scanner;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;
import edu.indiana.cs.c212.view.textual.CommandLineView;

public class CommandLinePlayer extends AbstractPlayer {
	public CommandLinePlayer(PlayerColor player) {
		super(player);
		this.scanner = new Scanner(System.in);
	}

	private Scanner scanner;
	
	/**
	 * The getMove for a CommandLinePlayer prompts the user for a x and a y and
	 * make a Move with that x and y.
	 * 
	 * @param board
	 *            this Game Board
	 * @param legalMoves
	 *            an ArrayList of legal moves
	 * @return the Move created from the keyboard prompt
	 */
	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		System.out.print(CommandLineView.boardToString(board));
		System.out.print(this.color + " to move: ");

		int x = 0, y = 0;
		System.out.println("Input the x coordinate of your move: ");
		x = scanner.nextInt();
		System.out.println("Input the y coordinate of your move: ");
		y = scanner.nextInt();

		Move move = new Move(x, y);

		return move;
	}

	/**
	 * {@inheritDoc}
	 */
	public String getName() {
		return "Command Line Player";
	}
}

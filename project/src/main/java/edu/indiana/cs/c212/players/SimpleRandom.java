package edu.indiana.cs.c212.players;

import java.util.List;

import java.util.Random;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;

public class SimpleRandom extends AbstractPlayer implements Player {
	

	public SimpleRandom(PlayerColor c) {
		super(c);
	}

	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		// random move
		Random rand = new Random();
		Move random = legalMoves.get(rand.nextInt(legalMoves.size()));
		return random;
	}

	@Override
	public String getName() {
		
		return "Simple Random";
	}

}

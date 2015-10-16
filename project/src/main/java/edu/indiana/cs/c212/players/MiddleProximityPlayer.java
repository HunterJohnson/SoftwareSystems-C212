package edu.indiana.cs.c212.players;

import java.util.List;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;

public class MiddleProximityPlayer extends AbstractPlayer implements Player {
	
	public MiddleProximityPlayer(PlayerColor c){
		super(c);
	}

	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		
		Move move = legalMoves.get(0);
		
		for(Move m : legalMoves){
			double dfc = distFromCenter(board, move);
			if(distFromCenter(board, m) < dfc){
				move = m;
			}
		}
		
		return move;
	}
	
	
	private double distFromCenter(Board board, Move m){
		int size = board.getSize();
		
		double centerX = ((size / 2) + 0.5);
		double centerY = ((size / 2) + 0.5);
		
		return Math.sqrt(Math.pow(Math.abs((m.getX() - centerX)), 2) + Math.pow(Math.abs(m.getY() - centerY), 2));
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Middle Proximity Player";
	}

}

package edu.indiana.cs.c212.players;


import java.util.List;
import java.util.Set;
import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.board.Tile;
import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;


public class BasicTrailsPlayer extends AbstractPlayer {
	
	public BasicTrailsPlayer(PlayerColor c) {
		super(c);	
	}

	
	private int moveScore(Move m, Board board){    // offensive score
		int x = m.getX();
		int y = m.getY();
		int size = board.getSize();
		
		if(this.color.equals(PlayerColor.BLUE)){
			return Math.min(x, size-x);	
		}
		if(this.color.equals(PlayerColor.RED)){
			return Math.min(y, size-y);
		}
		else{
			return 0;
		}
	}
	
	private int moveScore2(Move m, Board board){    // defensive score
		int n = 0;  // count of neighbors of opposing color 
		int x = m.getX();
		int y = m.getY();
		
		if(this.color.equals(PlayerColor.BLUE)){
			Set<Tile> neighbors = board.getNeighbors(board.getTileAt(x,y));
			for(Tile t : neighbors){
				if(t.getColor().equals(PlayerColor.RED)){
					n += 1;
				}
			}
			return n;
		}
		if(this.color.equals(PlayerColor.RED)){
			Set<Tile> neighbors = board.getNeighbors(board.getTileAt(x, y));
			for(Tile t : neighbors){
				if(t.getColor().equals(PlayerColor.BLUE)){
					n += 1;
				}
			}
			return n;
		}
		else{
			return 0;
		}
	}	
		
	
	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		
		if(this.color.equals(PlayerColor.BLUE)){	
			Move blueMove = legalMoves.get(0);
			
			int blueScore = moveScore(blueMove, board);
			int blueScore2 = moveScore2(blueMove, board);
	
			for(Move m : legalMoves){    // iterate -> return move with highest score
				if(moveScore(m, board) - moveScore2(m, board) > blueScore - blueScore2){
					blueMove = m;
				}
			}	
		return blueMove;		
		}
		
		if(this.color.equals(PlayerColor.RED)){
			Move redMove = legalMoves.get(0);
			
			int redScore = moveScore(redMove, board);
			int redScore2 = moveScore2(redMove, board);
			
			for(Move m : legalMoves){
				if(moveScore(m, board) - moveScore2(m,board) > redScore - redScore2){
					redMove = m;
				}
			}		
		
		return redMove;
		}
		
		else{
			return null;
		}
	}
	
		


	@Override
	public String getName() {
		return "Basic Trails";
	}

}

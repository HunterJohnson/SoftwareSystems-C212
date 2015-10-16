package edu.indiana.cs.c212.players;

import java.util.List;
import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;


public class WinBlockingPlayer extends AbstractPlayer implements Player {
	
	public WinBlockingPlayer(PlayerColor c){
		super(c);
	}

	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		
		
		if(this.color.equals(PlayerColor.RED)){
			// check for blue winning move
			findWinningMove(PlayerColor.BLUE, board);
			}
			
		
		else{
			findWinningMove(PlayerColor.RED, board);
		}
		
		return null;
	}
	
	public Move findWinningMove(PlayerColor c, Board board){
		
		int size = board.getSize();
		
		if(c.equals(PlayerColor.RED)){
			for(int x=0; x < 1; x++){   // red start column
				for(int y=0; y < size; y++){
					if(board.getTileAt(x,y).getColor().equals(PlayerColor.BLUE)){
						for(int goalx = size-1; goalx < size; goalx++){
							for(int goaly = 0; goaly < size; goaly++){
						//		if(areTilesConnected(board, board.getTileAt(x,y), board.getTileAt(goalx, goaly), c)){
									
								}
							}
						}
						
					}
						
					}
				}
			
		
		
		
		if(c.equals(PlayerColor.BLUE)){
		
			for(int x=0; x < size; x++){
				for(int y=0; y < size; y++){
					if(board.getTileAt(x,y).getColor().equals(PlayerColor.RED)){
					}}}}
		
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Win Blocking Player";
	}

}

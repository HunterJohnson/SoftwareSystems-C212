package edu.indiana.cs.c212.gameMechanics;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.players.Player;

public class LoseByConnectingRules extends StandardRules {
	
	public LoseByConnectingRules(Board board, Player red, Player blue) {
		super(board, red, blue);
	}
	
	public PlayerColor checkForWins(){
		if(super.checkForWins() == null){
			return null;
		}
		if(super.checkForWins().equals(red.getColor())){
			return blue.getColor();		
		}
		if(super.checkForWins().equals(blue.getColor())){;
			return red.getColor();
		}
		else
			return null;
	}
	

}

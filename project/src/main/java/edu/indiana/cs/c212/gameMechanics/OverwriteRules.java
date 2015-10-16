package edu.indiana.cs.c212.gameMechanics;

import java.util.ArrayList;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.exceptions.InvalidMoveException;


public class OverwriteRules extends StandardRules implements Rules {
    
    public OverwriteRules(Board board, edu.indiana.cs.c212.players.Player red, edu.indiana.cs.c212.players.Player blue) {     
    	super(board, red, blue);    
        }
    
    public boolean isLegalMove(Move m) {
        if (m.getClass() == new OverwriteMove(m.getX(), m.getY()).getClass()) {
            return false;
        }
        else if (board.getTileAt(m.getX(),m.getY()).getColor() == PlayerColor.BLANK){
            return true;
        }
        else return false;
    }
    
    public boolean isLegalOverwriteMove(Move m) {
        if (board.getTileAt(m.getX(),m.getY()).getColor() == playerlist.peek().getColor()){
            
            return false;
        }
        else return true;
    }
    
    public java.util.ArrayList<Move> getLegalMoves(edu.indiana.cs.c212.players.Player player){
        ArrayList<Move> legalMoves = new ArrayList<Move>();
        for(int x=0; x < board.getSize(); x++){
            for(int y=0; y < board.getSize(); y++){
                Move move = new Move(x,y);
                if (isLegalMove(move)){
                    legalMoves.add(move);
                }
                else if (this.isLegalOverwriteMove(move)) {
                    legalMoves.add(new OverwriteMove(x,y));
                }
            }
        }
        return legalMoves;
    }
    
    public void makeMove(Move m) throws InvalidMoveException {
        if(this.isLegalMove(m) || this.isLegalOverwriteMove(m)){
            
            if(super.playerlist.peek().equals(red)){
                board.makeMove(m, PlayerColor.RED);
            }
            if(super.playerlist.peek().equals(blue)){
                board.makeMove(m, PlayerColor.BLUE);
            }
        
        }
        
        else throw new InvalidMoveException("e", m, 0);
    }
    

}
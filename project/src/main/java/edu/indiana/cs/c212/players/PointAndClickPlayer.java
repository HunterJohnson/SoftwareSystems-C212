package edu.indiana.cs.c212.players;

import java.awt.AWTEvent;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.util.List;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;
import edu.indiana.cs.c212.view.graphical.MoveEvent;

public class PointAndClickPlayer extends AbstractPlayer implements
		AWTEventListener {
	
	private Point source;

	public PointAndClickPlayer(PlayerColor c) {
		super(c);
	}

	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		
		Toolkit.getDefaultToolkit().addAWTEventListener(this, 0);
		
		while(source == null){
			try{
				Thread.sleep(5);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
		
		Move move = new Move(source.x, source.y);
		
		source = null;
		Toolkit.getDefaultToolkit().removeAWTEventListener(this);
		
		return move;
	}

	@Override
	public void eventDispatched(AWTEvent event) {
		if(event.getClass().equals( MoveEvent.class ) ){
			source = (Point) event.getSource();
		}		
	}

	@Override
	public String getName() {
		return "Point and Click";
	}
	
	
	

}

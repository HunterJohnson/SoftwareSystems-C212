package edu.indiana.cs.c212.view.graphical;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JPanel;

import edu.indiana.cs.c212.board.Board;
import edu.indiana.cs.c212.board.Tile;
import edu.indiana.cs.c212.view.graphical.HexTile;

public class BoardPanel extends JPanel implements ActionListener, Observer {

    private static final long serialVersionUID = 1L;
    protected Board board;
    protected Point chosenXY;
    private int radius = 25;
    private HexTile[][] tiles;
    private int size;

    public BoardPanel(Board board) {
    	this.board = board;
    	size = board.getSize();
    	tiles = new HexTile[size][size];
        board.addObserver(this);
        resetBoard();
    }

    public void resetBoard(){

        for (int x = 0; x < size; x++) {
            for (int y = 0; y < size; y++) {
            	
	                Tile tile = board.getTileAt(x, y);
	                
	                HexTile newTile = new HexTile(x, y, radius, tile); 
	                                                                                                                               
	                newTile.addActionListener(this);
	
	                tiles[x][y] = newTile;
	                this.add(newTile);
            	}
        }
    }
            	  

    public void actionPerformed(ActionEvent e) {
    	
        HexTile tile = (HexTile) e.getSource();
       
        MoveEvent move = new MoveEvent(new Point(tile.getBoardX(),
                tile.getBoardY()),0);
        for (AWTEventListener l : Toolkit.getDefaultToolkit()
                .getAWTEventListeners()) {
            l.eventDispatched(move);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        repaint();
    }

    
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	resetBoard();
        for(int x=0; x < size; x++){
        	for(int y=0; y < size; y++){
        		tiles[x][y].paint(g);      		
        	}
        }
    }
    

}




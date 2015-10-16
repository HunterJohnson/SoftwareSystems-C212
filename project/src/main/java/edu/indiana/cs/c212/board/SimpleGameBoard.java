package edu.indiana.cs.c212.board;


import java.awt.Point;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import edu.indiana.cs.c212.gameMechanics.Move;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;
import edu.indiana.cs.c212.players.Player;

public class SimpleGameBoard extends AbstractGameBoard {

    public int size;
    public Player player;
    public ArrayList<Tile> tiles;
    private Tile[][] tileArray;
    
    private Tile startNodeRed;
    private Tile goalNodeRed;
    private Tile startNodeBlue;
    private Tile goalNodeBlue;
    
    
    
    public SimpleGameBoard(int size) {
        this.size = size;
        this.tileArray= new Tile[size][size];
		this.startNodeRed = new Tile(PlayerColor.RED, new Point(0, -1));
		this.goalNodeRed = new Tile(PlayerColor.RED, new Point(0, size));
		this.startNodeBlue = new Tile(PlayerColor.BLUE, new Point(-1, 0));
		this.goalNodeBlue = new Tile(PlayerColor.BLUE, new Point(size, 0));
		for (int x=0; x<size; x++) {
			for (int y=0; y<size; y++) {
				tileArray[x][y] = new Tile(PlayerColor.BLANK, new Point(x,y));
			}
		}
		
    }
 
    
	public SimpleGameBoard(SimpleGameBoard other){
		this.size = other.size;
		this.tileArray= new Tile[size][size];
		this.tiles = other.getTiles();
		
		this.startNodeRed = new Tile(PlayerColor.RED, new Point(0, -1));
		this.goalNodeRed = new Tile(PlayerColor.RED, new Point(0, size));
		this.startNodeBlue = new Tile(PlayerColor.BLUE, new Point(-1, 0));
		this.goalNodeBlue = new Tile(PlayerColor.BLUE, new Point(size, 0));
		
		for (int x=0; x<size; x++) {
			for (int y=0; y<size; y++) {
				tileArray[x][y] = new Tile(other.getTileAt(x, y));
			}
		}
	}
	
    /*
    private void setBoard(){
        tileArray = new Tile[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                tileArray[i][j] = new Tile(PlayerColor.BLANK, new Point(i, j));            
            }
        }    
    }
    */
    
    public int getSize() {
        return this.size;
    }
    
    public Player getPlayer() {
        return this.player;
    }
    
    public ArrayList<Tile> getTiles(){
        return this.tiles;
    }
    
    public Tile[][] getTileArray() {
        return this.tileArray;
    }
    
    @Override
    public void makeMove(Move m, PlayerColor player) {
        // TODO Auto-generated method stub
    	System.out.println(player);
        tileArray[m.getX()][m.getY()].setColor(player); 
        setChanged();
        notifyObservers();
    }

    @Override
    public Tile getTileAt(int x, int y) {
        // TODO Auto-generated method stub

        if (x < -1 || x > size || y < -1 || y > size) {
            return null;
        }
        if (x == -1) {
            return startNodeBlue;
        }
        if (y == -1) {
            return startNodeRed;
        }
        if (x == size) {
            return goalNodeBlue;
        }
        if (y == size) {
            return goalNodeRed;
        }
        else return tileArray[x][y];
    }

    
    @Override
    public Set<Tile> getNeighbors(Tile t) {
    	
    	Set<Tile> set = new HashSet<Tile>();

    
    	if(t.getPoint().x == startNodeBlue.getPoint().x){
    		for(int x=0; x < size; x++){
    			set.add(getTileAt(0,x)); // this?
    		}
    		return set;	
    	}
    	if(t.getPoint().y == startNodeRed.getPoint().y){
    		for(int x=0; x < size; x++){
    			set.add(getTileAt(x,0));
    		}
    		return set;
    	}
    	if(t.getPoint().y == goalNodeRed.getPoint().y){
    		for(int x=0; x < size; x++){
    			set.add(getTileAt(x, size-1));
    		}
    		return set;
    	} 	
    	if(t.getPoint().x == goalNodeBlue.getPoint().x){
    		System.out.println("print");
    		for(int x=0; x < size; x++){
    			set.add(getTileAt(size-1,x));
    		}
    		return set;
    	}
    	if(t.getPoint().equals(getTileAt(0,0).getPoint())){
    		set.add(startNodeRed);
    		set.add(startNodeBlue);
    		set.add(getTileAt(0,1));
    		set.add(getTileAt(1,0));
    	    return set;
    	}
    	if(t.getPoint().equals(getTileAt(size-1,0).getPoint())){
    		set.add(startNodeRed);
    		set.add(goalNodeBlue);
			set.add(getTileAt(size - 2, 0));
			set.add(getTileAt(size - 2, 1));
			set.add(getTileAt(size - 1, 1));
			return set;
		}
		if (t.getPoint().equals(getTileAt(0, size - 1).getPoint())) {
			set.add(startNodeBlue);
			set.add(goalNodeRed);
			set.add(getTileAt(0, size - 2));
			set.add(getTileAt(1, size - 2));
			set.add(getTileAt(1, size - 1));
			return set;
		}
		if (t.getPoint().equals(getTileAt(size - 1, size - 1).getPoint())) {
			set.add(goalNodeBlue);
			set.add(goalNodeRed);
			set.add(getTileAt(size - 2, size - 1));
			set.add(getTileAt(size - 1, size - 2));
			return set;
		}
		else {
			int tx = t.getPoint().x;
			int ty = t.getPoint().y;
			set.add(getTileAt(tx-1, ty));
			set.add(getTileAt(tx, ty+1));
			set.add(getTileAt(tx+1, ty));
			set.add(getTileAt(tx,ty-1));
			set.add(getTileAt(tx+1, ty-1));
			set.add(getTileAt(tx-1,ty+1));
			return set;
		}
		
	}
    
   
    	
}


package edu.indiana.cs.c212.board;

import edu.indiana.cs.c212.gameMechanics.PlayerColor;
import java.awt.*;

public class Tile {
	
	private PlayerColor color;
	private Point p;
	
	//constructor 1
	public Tile(PlayerColor color, java.awt.Point p){
		this.color = color;
		this.p = p;
	}
	
	//constructor 2
	public Tile(Tile tile){
		this.color = tile.getColor();
		this.p = new Point(tile.getPoint());
	}
	
	public PlayerColor getColor(){
		return color;
	}
	
	public Point getPoint(){
		return p;
	}
	
	public void setColor(PlayerColor value){
		this.color = value;
	}
	
	@Override
	public boolean equals(Object obj){
		if(this.getClass() != obj.getClass())
			return false;
		else if(this.getPoint().x == ((Tile) obj).getPoint().x && this.getPoint().y == ((Tile) obj).getPoint().y
			&& (this.getColor() == ((Tile) obj).getColor()))
			return true;
		else
			return false;	
	}
	
	public String toString(){
		return "java.awt.Point[x=" + p.x + ",y=" + p.y + "] " + color.name();
	}
	
	

}

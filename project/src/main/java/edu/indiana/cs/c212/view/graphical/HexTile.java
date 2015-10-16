package edu.indiana.cs.c212.view.graphical;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.event.MouseEvent;

import javax.swing.JButton;


import edu.indiana.cs.c212.board.Tile;
import edu.indiana.cs.c212.gameMechanics.PlayerColor;

public class HexTile extends JButton {

 private static final long serialVersionUID = 1L;
 private int x, y, radius;
 private Tile tile;
 private Polygon p = new Polygon();
	
	
	public HexTile(int x, int y, int radius, Tile tile){
		this.x = x;
		this.y = y;
		this.tile = tile;
		setRadius(radius);	
		calc();
	}
	
	
	private void calc(){
		p = new Polygon();
		for (int i = 0; i < 6; i++) {
            double inrad =  Math.sqrt((radius * radius) - ((radius / 2) * (radius / 2))); 
            double newX = 50 + inrad + (2 * inrad * x) + (inrad * y);
            double newY = 50 + radius + ((1.5 * radius) * y);
            double theta = i * Math.PI / 3 + Math.PI / 2;
            double xdist = radius * Math.cos(theta);
            double ydist = radius * Math.sin(theta);
            p.addPoint((int) (newX + xdist), (int) (newY + ydist));
		}
	}	
	
	@Override
	public boolean contains(int x, int y) {
		return p.contains(new Point(x,y));
	    }

	@Override
	public boolean contains(Point p){
		return this.p.contains(p.x, p.y);
	}
	
	public int getBoardX(){
		return (int) this.tile.getPoint().getX();
	}
	
	public int getBoardY(){
		return (int) this.tile.getPoint().getY();
	}
	
	@Override
	public void paint(Graphics g){	
		Graphics2D temp = (Graphics2D) g;
		temp.setColor(Color.WHITE); 
	
		if(tile.getColor().equals(PlayerColor.RED)){
			temp.setColor(Color.RED);  // set?
		}
		else if(tile.getColor().equals(PlayerColor.BLUE)){
			temp.setColor(Color.BLUE);
		}
		else{
			temp.setColor(Color.white);
		}
		
		temp.fillPolygon(p);
		temp.setColor(Color.black);
		temp.drawPolygon(p);		
	}
	
	@Override
	protected void processMouseEvent(MouseEvent e){
		//if(this.p.contains(e.getPoint())){
			super.processMouseEvent(e);	
	   // }
	}
	
	public void setRadius(int radius){
		this.radius = radius;
	}

}

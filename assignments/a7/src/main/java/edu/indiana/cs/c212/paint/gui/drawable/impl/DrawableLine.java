package edu.indiana.cs.c212.paint.gui.drawable.impl;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

import edu.indiana.cs.c212.paint.gui.drawable.DrawableShape;

public class DrawableLine extends DrawableShape{
	private Point2D from, to;
	private Line2D line;

	public DrawableLine(Point2D from, Point2D to){
		this.from =from;
		this.to = to;
	}
	
	@Override
	public final void resetBounds(Point2D from, Point2D to){
		super.resetBounds(from, to);
		
		
		line = new Line2D.Double(from, to);
	}
	
	@Override
	public void draw(Graphics2D tablet) {
        tablet = setOpacity(tablet);
        tablet.setStroke(getStroke());
        tablet.setColor(getFillColor());
        tablet.fill(line);
        tablet.setColor(getPenColor());
        tablet.drawLine((int)line.getX1(), (int)line.getY1(), (int)line.getX2(), (int)line.getY2());
		
	}
	
	@Override
	public String toString() {
        return super.toString() + "From = " + this.from + "To = " + this.to + "\n";
        }
}

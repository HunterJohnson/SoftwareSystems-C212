package edu.indiana.cs.c212.paint.gui.drawable.impl;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;

import edu.indiana.cs.c212.paint.gui.drawable.DrawableShape;

public class DrawableEllipse extends DrawableShape{
	private Ellipse2D ellipse;
	private Point2D center, onCircumference;
	
	public DrawableEllipse(Point2D center, Point2D circumference){
		this.center = center;
		this.onCircumference = circumference;
			
	}
	
	
	public final void resetBounds(Point2D center, Point2D y){
		super.resetBounds(center, y);
		
		this.center = center;
		this.onCircumference = y;
		
		double width = this.getLowerRight().getX() - this.getUpperLeft().getX());
		double height = this.getLowerRight().getY() - this.getUpperLeft().getY());
		
		this.ellipse = new Ellipse2D.Double(this.center.getX(), this.center.getY(), width, height);
	}
	
	@Override
	public void draw(Graphics2D tablet) {
		tablet = setOpacity(tablet);
                tablet.setStroke(getStroke());
                tablet.setColor(getFillColor());
                tablet.fill(ellipse);
                tablet.setColor(getPenColor());
                tablet.draw(ellipse);
		
	}
}

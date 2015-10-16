package edu.indiana.cs.c212.paint.gui.drawable.impl;

import java.awt.Graphics2D;

/* https://github.iu.edu/pages/c212-fall2014/assignments/a7/apidocs/edu/indiana/cs/c212/paint/gui/drawable/impl/DrawableCircle.html
 * 
 * CONSTRUCTORS
 * DrawableCircle(Point2D center, float radius) 
   DrawableCircle(Point2D center, Point2D onCircumference)
   
   METHODS
   void	draw(Graphics2D tablet)
     --- Draws this circle to the given Graphics2D tablet.
   void	resetBounds(Point2D center, Point2D onCircumference)
     --- Moves the circle to the given center point, and resets the radius given a point on the circumference.
   String toString()
     --- Gives a string version of the object that can be used in print statements.
 */

package edu.indiana.cs.c212.paint.gui.drawable.impl;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;


import edu.indiana.cs.c212.paint.gui.drawable.DrawableShape;

public class DrawableCircle extends DrawableShape{
	private Ellipse2D circle;
	private Point2D center, onCircumference;
	private double radius;
	
	public DrawableCircle(Point2D center, Point2D circumference){
		this.center = center;
		this.onCircumference = circumference;
			
	}

	public DrawableCircle(Point2D center, double radius){
		this.center = center;
		this.radius = radius;
	}
	
	@Override
	public final void resetBounds(Point2D center, Point2D y){
		super.resetBounds(center, y);
		
		this.center = center;
		this.onCircumference = y;
		this.radius = Math.sqrt(Math.abs(Math.pow(this.center.getX() - this.onCircumference.getX(), 2) + Math.pow(this.center.getY() - this.onCircumference.getY(), 2)));
		
		this.circle = new Ellipse2D.Double(this.center.getX(), this.center.getY(), this.radius, this.radius);
	}
	
	@Override
	public void draw(Graphics2D tablet) {
        tablet = setOpacity(tablet);
        tablet.setStroke(getStroke());
        tablet.setColor(getFillColor());
        tablet.fill(circle);
        tablet.setColor(getPenColor());
        tablet.draw(circle);
		
	}
	
	@Override
	public String toString() {
        return super.toString() + "center = " + this.center +  "center = " + this.radius + "\n";
    }

}



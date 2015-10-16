package edu.indiana.cs.c212;

/**
 * In this file you will write the Point class. The point class has a constructor, 2 class fields, and 4 methods.
 * @author 
 *
 */
public class Point { 
	//Every point is represented as an x and y value. Make some class variables to reflect that, and make them private. 
	private double x, y;
	
	/**
	 * Write a constructor that takes a double x and a double y, and sets the class variables to those values
	 * REMINDER: Don't forget to use the this keyword 
	 * @param x
	 * @param y
	 */
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Write a getX() method that returns the class variable x
	 * REMINDER:Make sure your return-type matches the type of variable you're returning.
	 * @returns the class x variable
	 */
	public Double getX(){
		//FIXME
		return x;
	}
	
	/**
	 * Write a getY() method that returns the class variable y
	 * REMINDER:Make sure your return-type matches the type of variable you're returning.
	 * @returns the class y variable
	 */
	public Double getY(){
		//FIXME
		return y;
	}
	
	/**
	 * Write a distanceTo method that takes another Point called other and returns the distance between the current point and the given point.
	 * Remember the Pythagorean theorem and feel free to use the Math.sqrt and Math.pow functions.
	 * 
	 * Does this method need to be static or nonstatic? If you're unsure as to why, ask your partner or UI to make sure you know.
	 * 
	 * @param other Point 
	 * @return
	 */
	public Double distanceTo(Point other){
		//FIXME
		/*double a = this.getX() - other.getX();
		double b = this.getY() - other.getY();
		return Math.sqrt(a*a + b*b);*/
		return distanceBetween(this, other);		
			
	}
	
	/**
	 * Write a distanceBetweenMethod that takes two points as arguments and returns the distance between the two points.
	 * 
	 * NOTE: The difference between DistanceTo and DistanceBetween is a matter of referencing the correct object. 
	 * REMINDER: Make sure your return types match the type you're calculating with.
	 * 
	 * Does this method need to be static or nonstatic? If you're unsure as to why, ask your partner or UI to make sure you know.
	 * 
	 * @param  Point p1
	 * @param  Point p2
	 * @return the distance between two points, given a starting and ending points
	 */
	public static Double distanceBetween(Point p1, Point p2){
		//FIXME
		double a = p1.getX() - p2.getX();
		double b = p1.getY() - p2.getY();
		return Math.sqrt(a*a + b*b);
	}
}

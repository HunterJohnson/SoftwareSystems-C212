package edu.indiana.cs.c212;
import java.lang.Math;

/**
 * In this file you will define a class Circle. A Circle has two class variables, a class constant, two constructors, and five methods. 
 * @author 
 *
 */
class Circle{
	//A Circle has two properties that we will be storing in fields: a radius, and an origin. 
	//Make sure the radius is a number you can do Math on and the origin is of type Point.
    private double radius;
    private Point origin;
    private final double PI = Math.PI;

    
    /**
     * Write a constructor that takes no arguments.
     * Here you will set default values for your fields so that if your class is instantiated, it has default values.
     * This constructor should be public.
     * 
     * REMINDER: Don't forget to reference fields with the keyword this.
     */
    public Circle(){
    	//FIXME
    	//Set a numerical value to radius
    	 //Set coordinates to origin
    	this(1, new Point(0,0) );
   
    }
    
    /**
     * 
     * Write a constructor that takes two arguments, a radius r, and a point p.
     * Remember to set the class variables to the values given in the parameters.
     * 
     * REMINDER: Don't forget to reference fields with the keyword this.
     * 
     * @param r
     * @param p
     */
    public Circle(double r, Point p){
    	//FIXME
    	//Set radius to r
    	//Set origin to p
    	this.radius = r;
    	this.origin = p;
  
    }
    
    /**
     * @return
     * 
     * Write a getter that returns the radius of the circle as a double
     */
    public double getRadius(){
    	//FIXME
    	//return the radius of the circle
    	return radius;
    }
    
    /**
     * @return
     * 
     * Write a getter that returns the center of the circle as a Point
     */
    public Point getOrigin(){
    	//FIXME
    	//return the center of the circle
    	return origin;
    }
    
    /**
     * Write a method, getCircumference, that takes zero arguments and returns the circumference of the circle.
     * NOTE: Use your class constant, PI, for pi
	 *
     * @return the circumference of the Circle
     */
    public double getCircumference(){
    	//FIXME
    	//return the circumference of the Circle
    	return (radius*2) * PI;
    }

    /**
     * Write a method getArea that takes zero arguments and returns the area of the circle.
     * NOTE: Use your class constant, PI, for pi
     * 
     * @return the Area of the Circle
     */
    public double getArea(){
    	//FIXME
    	//return the Area of the Circle
    	return (radius*radius) * PI;
    }
    
    /**
     * This method will return a number representing the distance between two Circles. 
     * Mathematically, this can be done by finding the distance between the centers of the circles 
     * and then subtracting from the radii of the two circles from that.  
     * 
     * Note: If the circles overlap, this method should return a negative number.
     * In formula form :        distanceBetweenCenters - radiusA - radiusB
     * 
     * @param a Circle Type
     * @param b Circle Type
     * @return the distance between the two Circles
     */
    
    public static Double distanceBetweenCircles(Circle a, Circle b){
    	//FIXME
    	return a.origin.distanceTo(b.origin) - a.radius - b.radius;
    }
}
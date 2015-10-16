package edu.indiana.cs.c212;

/**
 * In this class, you will define the method at the bottom of the class.
 * THIS IS THE CLASS YOU WILL RUN WHEN YOU'RE FINISHED WITH YOUR WORK.
 * @author 
 *
 */
class Lab4{

    /**
     * This is the given main method. If you fill in all of the other class files that have been given to you, you should be able to run this file.
     * RUN THIS FILE WHEN YOU'VE COMPLETED THE OTHER CLASSES
     * @param args
     */
    
	public static void main(String[] args) {

		// feel free to change these constructors to see if you can get the
		// various messages to display when run.
		Circle a = new Circle(5, new Point(2, 3));
		Circle b = new Circle();

		/*
		 * This block checks to see whether the created Circles are touching,
		 * overlap or separate.The expected result of running this class is They
		 * Overlap!EXPECTED: They Overlap!
		 */
		if(Circle.distanceBetweenCircles(a, b) != null){
			if (Circle.distanceBetweenCircles(a, b) > 0){
				System.out.println("They do not touch!");
			}
			else if (Circle.distanceBetweenCircles(a, b) == 0){
				System.out.println("They intersect at one point!");
			}
			else{
				System.out.println("They Overlap!!");
			}
		}
		else{
			System.out.println("Error: distanceBetweenCircles returned null");
		}
	}
}
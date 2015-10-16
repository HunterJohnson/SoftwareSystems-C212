package edu.indiana.cs.c212;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Lab4Test {
		
		private double pi;
		@Before
		public void setUp() throws Exception {
			pi = Math.PI;
		}
		
		@Test(timeout=1000)
		public void testGetX1() {
			Point point = new Point(-5, 0);
			assertEquals(-5, point.getX(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetX2() {
			Point point = new Point(0, 0);
			assertEquals(0, point.getX(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetX3() {
			Point point = new Point(14, 0);
			assertEquals(14, point.getX(), .0001);
		}
	
		@Test(timeout=1000)
		public void testGetY1() {
			Point point = new Point(0, -5);
			assertEquals(-5, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetY2() {
			Point point = new Point(0, 0);
			assertEquals(0, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetY3() {
			Point point = new Point(0, 14);
			assertEquals(14, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testPoint1() {
			Point point = new Point(1, 1);
			assertEquals(1, point.getX(), .0001);
			assertEquals(1, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testPoint2() {
			Point point = new Point(0, 5);
			assertEquals(0, point.getX(), .0001);
			assertEquals(5, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testPoint3() {
			Point point = new Point(20, -4);
			assertEquals(20, point.getX(), .0001);
			assertEquals(-4, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testPoint4() {
			Point point = new Point(-13, 7);
			assertEquals(-13, point.getX(), .0001);
			assertEquals(7, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testPoint5() {
			Point point = new Point(0, 0);
			assertEquals(0, point.getX(), .0001);
			assertEquals(0, point.getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo1(){
			Point p1 = new Point(0,0);
			Point p2 = new Point(3,4);
			assertEquals(5, p1.distanceTo(p2), .0001);
		}

		@Test(timeout=1000)
		public void testDistanceTo2(){
			Point p1 = new Point(0,0);
			Point p2 = new Point(273, 136);
			assertEquals(305, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo3(){
			Point p1 = new Point(0,0);
			Point p2 = new Point(231, 160);
			assertEquals(281, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo4(){
			Point p1 = new Point(4,3);
			Point p2 = new Point(0,0);
			assertEquals(5, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo5(){
			Point p1 = new Point(136, 273);
			Point p2 = new Point(0,0);
			assertEquals(305, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo6(){
			Point p1 = new Point(160, 231);
			Point p2 = new Point(0,0);
			assertEquals(281, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo7(){
			Point p1 = new Point(231, 160);
			Point p2 = new Point(0,0);
			assertEquals(281, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo8(){
			Point p1 = new Point(-1,-2);
			Point p2 = new Point(2,2);
			assertEquals(5, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo9(){
			Point p1 = new Point(-172,12);
			Point p2 = new Point(151,-24);
			assertEquals(325, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo10(){
			Point p1 = new Point(81,-132);
			Point p2 = new Point(-80,-372);
			assertEquals(289, p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceTo11(){
			Point p1 = new Point(0,-1);
			Point p2 = new Point(1,0);
			assertEquals(Math.sqrt(2), p1.distanceTo(p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween1(){
			Point p1 = new Point(0,0);
			Point p2 = new Point(3,4);
			assertEquals(5, Point.distanceBetween(p1, p2), .0001);
		}

		@Test(timeout=1000)
		public void testDistanceBetween2(){
			Point p1 = new Point(0,0);
			Point p2 = new Point(273, 136);
			assertEquals(305, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween3(){
			Point p1 = new Point(0,0);
			Point p2 = new Point(231, 160);
			assertEquals(281, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween4(){
			Point p1 = new Point(4,3);
			Point p2 = new Point(0,0);
			assertEquals(5, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween5(){
			Point p1 = new Point(136, 273);
			Point p2 = new Point(0,0);
			assertEquals(305, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween6(){
			Point p1 = new Point(160, 231);
			Point p2 = new Point(0,0);
			assertEquals(281, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween7(){
			Point p1 = new Point(231, 160);
			Point p2 = new Point(0,0);
			assertEquals(281, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween8(){
			Point p1 = new Point(-1,-2);
			Point p2 = new Point(2,2);
			assertEquals(5, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween9(){
			Point p1 = new Point(-172,12);
			Point p2 = new Point(151,-24);
			assertEquals(325, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween10(){
			Point p1 = new Point(81,-132);
			Point p2 = new Point(-80,-372);
			assertEquals(289, Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testDistanceBetween11(){
			Point p1 = new Point(-1, 0);
			Point p2 = new Point(0, 1);
			assertEquals(Math.sqrt(2), Point.distanceBetween(p1, p2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetRadius1(){
			Circle circle = new Circle(1, new Point(0,0));
			assertEquals(1, circle.getRadius(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetRadius2(){
			Circle circle = new Circle(42, new Point(0,0));
			assertEquals(42, circle.getRadius(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetRadius3(){
			Circle circle = new Circle(1001, new Point(0,0));
			assertEquals(1001, circle.getRadius(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin1(){
			Circle circle = new Circle(0, new Point(1,0));
			assertEquals(1, circle.getOrigin().getX(), .0001);
			assertEquals(0, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin2(){
			Circle circle = new Circle(0, new Point(0,1));
			assertEquals(0, circle.getOrigin().getX(), .0001);
			assertEquals(1, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin3(){
			Circle circle = new Circle(0, new Point(-1,0));
			assertEquals(-1, circle.getOrigin().getX(), .0001);
			assertEquals(0, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin4(){
			Circle circle = new Circle(0, new Point(0,-1));
			assertEquals(0, circle.getOrigin().getX(), .0001);
			assertEquals(-1, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin5(){
			Circle circle = new Circle(0, new Point(5, -3));
			assertEquals(5, circle.getOrigin().getX(), .0001);
			assertEquals(-3, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin6(){
			Circle circle = new Circle(0, new Point(1.4, -2.7));
			assertEquals(1.4, circle.getOrigin().getX(), .0001);
			assertEquals(-2.7, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin7(){
			Circle circle = new Circle(0, new Point(1312, 476));
			assertEquals(1312, circle.getOrigin().getX(), .0001);
			assertEquals(476, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetOrigin8(){
			Circle circle = new Circle(0, new Point(-683.725, 412.316));
			assertEquals(-683.725, circle.getOrigin().getX(), .0001);
			assertEquals(412.316, circle.getOrigin().getY(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetCircumference1(){
			Circle circle = new Circle(1, new Point(0, 0));
			assertEquals(2*pi, circle.getCircumference(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetCircumference2(){
			Circle circle = new Circle(12, new Point(21, -2));
			assertEquals(2*pi*12, circle.getCircumference(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetCircumference3(){
			Circle circle = new Circle(42.3, new Point(0, 0));
			assertEquals(2*pi*42.3, circle.getCircumference(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetCircumference4(){
			Circle circle = new Circle(134.61, new Point(-5, 3));
			assertEquals(2*pi*134.61, circle.getCircumference(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetSurfaceArea1(){
			Circle circle = new Circle(1, new Point(0, 0));
			assertEquals(pi, circle.getArea(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetSurfaceArea2(){
			Circle circle = new Circle(14, new Point(1, -1));
			assertEquals(196*pi, circle.getArea(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetSurfaceArea3(){
			Circle circle = new Circle(13.12, new Point(0, 0));
			assertEquals(Math.pow(13.12,  2)*pi, circle.getArea(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetSurfaceArea4(){
			Circle circle = new Circle(47.1, new Point(-15, 12));
			assertEquals(Math.pow(47.1, 2)*pi, circle.getArea(), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles1(){
			Circle c1 = new Circle(0, new Point(0, 0));
			Circle c2 = new Circle(0, new Point(1, 0));
			assertEquals(1, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles2(){
			Circle c1 = new Circle(1, new Point(1, 0));
			Circle c2 = new Circle(1, new Point(-1, 0));
			assertEquals(0, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles3(){
			Circle c1 = new Circle(2, new Point(0, 0));
			Circle c2 = new Circle(4, new Point(0, 0));
			assertEquals(-6, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles4(){
			Circle c1 = new Circle(5, new Point(-1, 2));
			Circle c2 = new Circle(7, new Point(14, 26));
			assertEquals(16.30194339616981, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles5(){
			Circle c1 = new Circle(3, new Point(1, 1));
			Circle c2 = new Circle(4, new Point(9, 1));
			assertEquals(1, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles6(){
			Circle c1 = new Circle(2, new Point(14, 3));
			Circle c2 = new Circle(6, new Point(12, 6));
			assertEquals(-4.39444872453601, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles7(){
			Circle c1 = new Circle(3, new Point(1.5, 1.5));
			Circle c2 = new Circle(3, new Point(-2.1, -4));
			assertEquals(0.573431371817918, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles8(){
			Circle c1 = new Circle(Math.sqrt(2)/2, new Point(4, 3));
			Circle c2 = new Circle(Math.sqrt(2)/2, new Point(5, 2));
			assertEquals(0, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles9(){
			Circle c1 = new Circle(2, new Point(-7, -6));
			Circle c2 = new Circle(3, new Point(-6.5, -4));
			assertEquals(-2.9384471911697, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles10(){
			Circle c1 = new Circle(25, new Point(100, 0));
			Circle c2 = new Circle(25, new Point(0, 0));
			assertEquals(50, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles11(){
			Circle c1 = new Circle(6, new Point(-15, 5));
			Circle c2 = new Circle(14, new Point(5, 15));
			assertEquals(2.360679774997898, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
		
		@Test(timeout=1000)
		public void testGetDistanceBetweenCircles12(){
			Circle c1 = new Circle(34, new Point(-23.85, 21));
			Circle c2 = new Circle(16, new Point(-18.2, -12));
			assertEquals(-16.519819295589215, Circle.distanceBetweenCircles(c1, c2), .0001);
		}
}

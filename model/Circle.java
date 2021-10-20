package model;
import java.lang.Math.*;  
 

public class Circle {
	protected Point center;
	protected double radius;
	private double area;
	
	public Circle(Point p, double rad) {
		center = p;
		radius = rad;
		area = rad*rad*Math.PI;
	}
	
	public Circle () {
		
	}

	@Override
	public String toString() {
		return ("The center is: "+ center.toString() + " The radius is: " + radius + " This is the area: " + area) ;
	}
	
	
	public Circle translate (int dx, int dy) {
		center = center.translate(dx, dy);
		return new Circle(center, radius);
	}
	

	public Point getCenter() {
		return new Point (center);
	}
	
	public Boolean contains (Point p) {
		return center.distance(p) < radius;
	}
	
	public static Boolean contains (Point p, Circle[] circles) {
		for (Circle c: circles) {
			if (c.contains(p)) {
				return true;
			}
		}	
		return false;
	}

	public double getRadius() {
		return radius;
	}
	
	

}

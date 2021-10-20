package model;
import java.lang.Math.*;

public class Ring extends Circle{
	private double inner;
	//Circle c;
	//Point center;
	
	public Ring (double a, double b, Point center) {
		super(center, Math.max(a,b));
		this.inner = Math.min(a,b);
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Ring )) {
			Ring ring = (Ring) obj; // Pour forcer a faire un objet Ring
			return this.inner==ring.inner && super.equals(ring);
		}
		else return false;
	}

	@Override
	public String toString() {
		return ("The center is: "+ super.center.toString() + " The inner radius is: " + inner + " The outer radius is: " + super.radius);
	}
	
	
	public Boolean contains(Point point) {;
		return (inner<super.center.distance(point) && super.contains(point));
	}
	
	
	public static Boolean contains (Point point, Ring[] rings) {
		for (Ring r: rings) {
			if (r.contains(point)) {
				return true;
			}
		}	
		return false;
	}

	
	

}

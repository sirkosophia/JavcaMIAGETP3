package model;

import java.util.ArrayList;

public class LCircle {
	private ArrayList<Circle> lc = new ArrayList<Circle>();  
	Point p = new Point(50, 150);
	Circle e = new Circle(p, 80);
	
	
	public LCircle () {
		lc.add(e);
	}


	public ArrayList<Circle> getLc() {
		return lc;
	}
	
	public void ad (Circle c) {
		lc.add(c);
	}
	
	

}

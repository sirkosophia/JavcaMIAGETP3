package model;

public class Point {
	private int x;
	private int y;
	public int count = 0;
	
	public Point() {
		count ++;
	}
	
	public Point(int px, int py) {
		this.x = px;
		this.y = py;
		count++;
	}
	
	public Point (Point p2) {
		this.x = p2.x;
		this.y = p2.y;
		count++;
	}

	@Override
	public String toString() {
		return ("(" + this.x+ "," + this.y + ")");
	}
	
	public Boolean isSameAs (Point p) {
		return (this.x == p.x) && (this.y == p.y);
	}

	@Override
	public boolean equals(Object obj) {
		if ((obj instanceof Point )) {
			Point p = (Point) obj; // Pour forcer a faire un objet Point
			return ((this.x == p.x) && (this.y == p.y));
		}
		else return false;
	}
	
	
	public Point translate(int dx, int dy) {
		return new Point(x+dx,y+dy) ;
	}
	
	/*
	public void translate(double dx, double dy) {
		x += dx;
		y += dy;
	}
	*/
	
	public double distance(Point p) {
		return Math.sqrt((p.x-x)*(p.x-x) + (p.y-y)*(p.y-y));	
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	

}

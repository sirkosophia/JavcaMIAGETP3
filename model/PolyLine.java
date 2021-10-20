package model;
import java.util.LinkedList;
import java.util.Objects;

public class PolyLine {
	private int len;
	//private Point[] l;
	LinkedList<Point> ll;
	private int index = 0;
	
	public PolyLine() {
		this.ll = new LinkedList<>(); 
	}
	
	public void add(Point p) {
		ll.add(p);
	}
	
	
	/*public PolyLine(int len) {
		l = new Point[len];
		this.len = len;
	}
	*/
	
	
	/*public void add(Point p) {
		if (index < this.len) {
			this.l[this.index] = Objects.requireNonNull(p);
			index++;
		}	
	}
	*/
	/*public static <T> T requireNonNull(T obj) {
	    if (obj == null)
	        throw new NullPointerException();
	    return obj;
	}
	*/
	public void pointCapacity() {
		System.out.println("Il y a pas de limite de capacite");;
	}
	
	public int nbPoints() {
		return (this.ll.size());
	}
	
	public Boolean contains(Point p) {
		Boolean res = false;
		for (Point pp: this.ll){
			if (pp.equals(p)) {
				res = true;
			}
		}
		return res;
	}

	public LinkedList<Point> getL() {
		return this.ll;
	}

	public int getLen() {
		return ll.size();
	}

	

	
	
	
}

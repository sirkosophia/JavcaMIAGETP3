package fr.dauphine.javaavance.td1;

import java.util.ArrayList;

public class main1 {

	public static void main(String[] args) {
		
		Point p = new Point(1,4);
	
		System.out.println(p);
		
		 Point p1=new Point(1,2);
		 Point p2=p1;
		 Point p3=new Point(1,2);
		 
		 System.out.println(p1==p2);
		 System.out.println(p1==p3);
		 
		 Point pp1 = new Point(1,2);
		 Point pp2=pp1;
		 Point pp3=new Point(1,2);
		 ArrayList<Point> list = new ArrayList<>();
		 list.add(pp1);
		 System.out.println(list.indexOf(pp2));
		 System.out.println(list.indexOf(pp3));
		 
		 PolyLine ll = new PolyLine();
		 ll.add(pp3);
		 ll.add(pp3);
		 ll.add(pp3);
		 //ll.contains(null);
		 //ll.add(null);
		 //System.out.println(ll.contains(null));
		 for (Point pp: ll.getL()){
				System.out.println(pp);
			}
		 int len = ll.getLen();
		 System.out.println(len);
		 
	
		 Point ppp=new Point(1,2);
		 Circle c=new Circle(ppp,1);
		 Circle c2=new Circle(ppp,2);
		 c2.translate(1,1);
		 System.out.println(c+" "+c2);
		 
		 Circle cc=new Circle(new Point(1,2), 1);
		 cc.getCenter().translate(1,1);
		 System.out.println(cc);
		 System.out.println(cc.getCenter().translate(1,1));
		 
		 
	
		 
		 
	}

}

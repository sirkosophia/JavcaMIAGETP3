package view;

import java.awt.*;
import javax.swing.*;
import controller.*;
import model.*;

public class MyDisplay extends JPanel{
	private static LCircle lc = new LCircle();;
	public static void main(String []args){
	
		JFrame frame = new JFrame("Java Avancee - Graphic Display");
		
		frame.setSize(new Dimension(500,500)); //Resizes this component so that it has width d.width and height d.height.
		
		frame.setVisible(true); //Shows or hides this Window depending on the value of parameter
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/*
		 Sets the operation that will happen by default when the user initiates a "close" on this frame. You must specify one of the following choices:
DO_NOTHING_ON_CLOSE (defined in WindowConstants): Don't do anything; require the program to handle the operation in the windowClosing method of a registered WindowListener object.
HIDE_ON_CLOSE (defined in WindowConstants): Automatically hide the frame after invoking any registered WindowListener objects.
DISPOSE_ON_CLOSE (defined in WindowConstants): Automatically hide and dispose the frame after invoking any registered WindowListener objects.
EXIT_ON_CLOSE (defined in JFrame): Exit the application using the System exit method. Use this only in applications.
*/
		
		MyDisplay d = new MyDisplay();
		
		frame.add(d);
		
		frame.setLocation(550, 25);
		frame.setVisible(true);
		
	
		MouseController cont = new MouseController(lc, d);
		frame.addMouseMotionListener(cont);

	}
	

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);
		g.setFont(new Font("Seqoe UI", Font.PLAIN, 16));
		g.setColor(Color.BLUE);
		//g.drawLine(50, 50, 50, 100);
		//g.drawOval(150, 80, 40, 40);
		for (int i = 0 ; i < lc.getLc().size(); i++){
			model.Point p = lc.getLc().get(i).getCenter();
			int rad = (int) lc.getLc().get(i).getRadius();
			int x = (int) (p.getX()-20);
			int y = (int) (p.getY()-20);
			g.drawOval(x, y, rad, rad);
		}	
	}
		
}


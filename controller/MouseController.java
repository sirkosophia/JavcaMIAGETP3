package controller;

import java.awt.List;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JPanel;

import model.*;
import view.MyDisplay;


public class MouseController implements MouseMotionListener {
	
	private LCircle lc;
	private MyDisplay md;
	
	public MouseController (LCircle lc, MyDisplay md) {
		this.lc = lc;
		this.md = md;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY());
		Circle so = new Circle(p, 50);
		lc.ad(so);
		md.repaint();
	}
}

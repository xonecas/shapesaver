/*
   sean caetano martin
   seancaetanomartin@gmail.com
   CIS 255 HY
   MyLine.java - line creation object for draw panel
   assignment#5
   3/28/11
*/

import java.awt.Color;
import java.awt.Graphics;

public class MyLine extends Shape
{
	// super default constructor call
	public MyLine ()
	{
		super();
	}// end super call

	// super constructor call
	public MyLine (int x1, int y1, int x2, int y2, Color color)
	{
		super (x1,x2,y1,y2,color);
	}// end super call

	// draw override
	@Override
	public void draw (Graphics g)
	{
		g.setColor(getColor());
		g.drawLine(getX1(),getX2(),getY1(),getY2());
	}// end draw
}// end MyLine

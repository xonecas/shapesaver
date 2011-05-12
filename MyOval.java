/*
sean caetano martin
seancaetanomartin@gmail.com
CIS 255 HY
MyOval.java - oval shape creation for draw panel class
assignment#5
3/28/11
*/

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyOval extends MyBoundedShape
{
	// random object for radial draw
	private Random randomNumbers = new Random();
	
	// super default constructor call
	public MyOval ()
	{
	 	super ();
	}// end super call

	// super constructor call
	public MyOval (int x1, int y1, int x2, int y2, Color color, Boolean filled)
	{
 		super (x1,x2,y1,y2,color, filled);
	}// end super call

	// draw override
	@Override
	public void draw (Graphics g)
	{
		g.setColor(getColor());
		
		if (isFilled())
		{
			 g.fillOval(getUpperLeftX(), getUpperLeftY(), getWidth(),getHeight());
		}// end if
		else
		{
         g.drawOval(getUpperLeftX(), getUpperLeftY(), getWidth(),getHeight());
      }// end else 
	}// end draw
}// end MyOval

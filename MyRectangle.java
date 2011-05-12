/*
sean caetano martin
seancaetanomartin@gmail.com
CIS 255 HY
MyRectangle.java - rectangle shape creation for draw panel
assignment#5
3/28/11
*/

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MyRectangle extends MyBoundedShape
{
	// random object for radial draw
	private Random randomNumbers = new Random();

	// super default constructor call
	public MyRectangle ()
	{
		super();
	}

	// super constructor call
	public MyRectangle (int x1, int y1, int x2, int y2, Color color, Boolean filled)
	{
		super(x1,x2,y1,y2,color,filled);
	}

	//draw override
	@Override
	public void draw (Graphics g)
	{
		g.setColor(getColor());

		if (isFilled())
		{
			 g.fillRect(getUpperLeftX(), getUpperLeftY(), getWidth(), getHeight());
      }
		else
		{
         g.drawRect(getUpperLeftX(), getUpperLeftY(), getWidth(),getHeight());
      }// end else
	}// end draw
}// and MyRectangle

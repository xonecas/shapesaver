/*
   sean caetano martin
   seancaetanomartin@gmail.com
   CIS 255 HY
   MyBoundedShape.java abstract superclass
   assignment#5
   3/28/11
*/

import java.awt.Color;
import java.awt.Graphics;

public abstract class MyBoundedShape extends Shape
{
	private boolean filled;

	//default contructor
	public MyBoundedShape ()
	{
		super();
	}//end default contructor

	// constructor
	public MyBoundedShape (int x1, int y1, int x2, int y2, Color color, Boolean fill)
	{
		super (x1,y1,x2,y2,color);
		setFilled(fill);
	}//end contructor

	// getUpperLeftX
	public int getUpperLeftX ()
	{
      return getX1();
   }

	// getUpperLeftY
	public int getUpperLeftY ()
	{
      return getY1();
   }

	// getWidth
	public int getWidth ()
	{
      return Math.abs(getX1() - getX2());
   }

	// getHeight
	public int getHeight ()
	{
      return Math.abs(getY1()- getY2());
   }

	// isFilled
	public boolean isFilled ()
	{
      return filled;
   }

	// setfilled
	public void setFilled (boolean fill)
	{
      filled = fill;
   }
}//end MyBoundedShape

/*
sean caetano martin
seancaetanomartin@gmail.com
CIS 255 HY
Shape.java - abstract superclass
assignment#5
3/28/11
*/

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape
{
	// instance variables
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	private Color myColor;

	//default contructor
	public Shape ()
	{
		this.x1 = 0;
		this.y1 = 0;
		this.x2 = 0;
		this.y2 = 0;
		myColor = Color.BLACK;
	}// end default contructor

	// contructor
	public Shape (int x1, int x2, int y1, int y2, Color color)
	{
		setX1(x1);
		setX2(x2);
		setY1(y1);
		setY2(y2);

	}// end contructor

	// get x1
	public int getX1 ()
	{return x1;}

	// get x2
	public int getX2 ()
	{return x2;}

	// get y1
	public int getY1 ()
	{return y1;}

	// get y2
	public int getY2 ()
	{return y2;}

	// get color
	public Color getColor()
	{return myColor;}

	public void setX1 (int x1)
	{
		if (x1>=1){this.x1 = x1;}
		else{this.x1 = 0;}
	}//end set x1

	public void setX2 (int x2)
	{
		if (x2>=1){this.x2 = x2;}
		else{this.x2 = 0;}
	}//end set x2

	public void setY1 (int y1)
	{
		if (y1>=1){this.y1 = y1;}
		else{this.y1 = 0;}
	}//end set y1

	public void setY2 (int y2)
	{
		if (y2>=1){this.y2 = y2;}
		else{this.y2 = 0;}
	}//end set y2

	// draw ensure abstract
	public abstract void draw (Graphics g);

}//end shape

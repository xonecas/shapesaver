/*
sean caetano martin
seancaetanomartin@gmail.com
CIS 255 HY
MyTriangle.java 
assignment#5
3/28/11
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.util.Random;

public class MyTriangle extends MyLine
{
	private Random randomNumbers = new Random();
	
	Color color;
	private int x3;
	private int y3;

	public MyTriangle ()
	{super ();}

	public MyTriangle (int x1, int y1, int x2, int y2, int x3, int y3, Color color)
	{
		super( x1, y1, x2, y2, color );
		setX3(x3);
		setY3(y3);	
	}

	public void setX3( int thirdX )
	{
      x3 = ( thirdX < 0 ? 0 : thirdX-thirdX%50 );
   }

	public int getX3()
	{
      return x3;
   }

	public void setY3( int thirdY )
	{
      y3 = ( thirdY < 0 ? 0 : thirdY-thirdY%50 );
   }

	public int getY3()
	{
      return y3;
   }

	@Override
	public void draw (Graphics g)
	{
		g.setColor(getColor());

		int[] xValues = { getX1(), getX2(), getX3() };
		int[] yValues = { getY1(), getY2(), getY3() };
		g.fillPolygon(xValues,yValues, yValues.length );

	}
}

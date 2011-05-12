/*
   sean caetano martin
   seancaetanomartin@gmail.com
   CIS 255 HY
   DrawPanel.java
   assignment#5
   3/28/11
*/

import java.awt.*;
import java.util.Random;
import javax.swing.JPanel;
import java.awt.event.*;

public class DrawPanel extends JPanel implements MouseMotionListener
{
	//prtivate varibales and random object creation
	private Random randomNumbers = new Random();
	private int shapeCounter = 0;
	private boolean firstTime = true;

	public DrawPanel()
	{
		setBackground (Color.BLACK);
	}// end contructor

	public void mouseDragged (MouseEvent e){}// end method
	
	public void mouseMoved (MouseEvent e)
	{
		if (firstTime == true)
		{
         firstTime = false;
      }
		else
		{
         System.exit(0);
      }
	}// end method

	public void paintComponent (Graphics g)
	{
		// 100 shape reset function
		if (shapeCounter == 100)
		{
			super.paintComponent (g);
			shapeCounter = 0;
		}

		// random color generation
		Color color1 = new Color(randomNumbers.nextInt(256),
			randomNumbers.nextInt(256),randomNumbers.nextInt(256));
		Color color2 = new Color(randomNumbers.nextInt(256),
			randomNumbers.nextInt(256),randomNumbers.nextInt(256));
		
		// boolean for gradient value
		boolean cyclic = randomNumbers.nextBoolean();
      // filled
      boolean filled = randomNumbers.nextBoolean();

		// position generation for x and y variables
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      int width = screenSize.width;
      int height = screenSize.height;

		int sizeWidth = randomNumbers.nextInt(width);
      int sizeHeight = randomNumbers.nextInt(height);
		
		int x1,y1,x2,y2,x3,y3;
		x1 = randomNumbers.nextInt(width-sizeWidth);
		y1 = randomNumbers.nextInt(height-sizeHeight);
		x2 = x1+sizeWidth;
		y2 = y1+sizeHeight;
		x3 = x1;
		y3 = y2;
		
		// boundary control function
		if (x2 >= width)
		{
         x1 = width - sizeWidth;
		   x2 = width;
      }// end if X control
		if (y2 >= height)
		{
         y1 = height - sizeHeight;
		   y2 = height;
      } // end if y control

      Shape shape;
		//object creation
		switch (randomNumbers.nextInt(4))
		{
			case 1:
				shape = new MyOval (x1,y1,x2,y2, color1, filled);
				break;
			case 2:
				shape = new MyRectangle (x1,y1,x2,y2, color1, filled);
				break;
			case 3:
				shape = new MyTriangle (x1,y1,x2,y2,x3,y3, color1);
				break;
			default:
            shape = new MyLine (x1, x2, y1, y2, color1);
				break;
		}// end switch
		
		// polymorphic draw 
		Graphics2D g2 = (Graphics2D )g.create();
		Paint p = new GradientPaint(0, 0, color1, width/50, height/70, color2, cyclic);
		g2.setPaint(p);
		shape.draw(g2);
		g2.dispose();
		shapeCounter++;

		try 
      {
         Thread.sleep(700);
      } 
      catch(Exception e) {}

		repaint();
	}//end method
}// end class

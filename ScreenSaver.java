/*
sean caetano martin
seancaetanomartin@gmail.com
CIS 255 HY
ScreenSaver.java
assignment#5
3/28/11
*/

import javax.swing.*;
import java.awt.*;

public class ScreenSaver
{
	public static void main (String []args)
	{
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = screenSize.width;
		int height = screenSize.height;
		DrawPanel panel = new DrawPanel();
		JFrame application = new JFrame();
		application.setBackground (Color.BLACK);
		application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		application.setUndecorated (true);
		application.setSize (width,height);
		application.add(panel);
		application.addMouseMotionListener(panel);
		application.setVisible(true);
	}
}

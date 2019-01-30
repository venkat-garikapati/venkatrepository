package utility;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Library 
{
	public static String screen(String name)
	{
		try {
    //for screenshot javaRobot ..window based screens i.e,pop-up windows
			Robot r=new Robot();
	
	//for getting screen size Dimension Class used
			Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	
	//Rectangle buffered image
			Rectangle rc=new Rectangle(d);
			BufferedImage bi=r.createScreenCapture(rc);
			ImageIO.write(bi, "png",new File(".\\screen\\"+name+".png"));
		   } 
		catch (Exception e) 
		  {
			// TODO Auto-generated catch block
			e.printStackTrace();
	      }
		return name; 
		
	}

}

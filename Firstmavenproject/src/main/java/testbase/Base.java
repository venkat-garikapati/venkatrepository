package testbase;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.By;

	public class Base 
	{
		static Properties pro;
		public static void loadproperty()
		{
			try
			{
				File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\config.properties");
				FileReader fr=new FileReader(f);
				 pro=new Properties();
				pro.load(fr);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		public static String getconfig(String key)
		{
			loadproperty();
			String x=pro.getProperty(key);
			return x;
		}
		public static void loadproperty1()
		{
			try
			{
				File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\configuration\\OR.properties");
				FileReader fr=new FileReader(f);
				pro=new Properties();
				pro.load(fr);
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
		
		}
		public static By getelement(String Key)
		{
			loadproperty1();
			By loc=null;
			
			String value=pro.getProperty(Key);
			
			String loctype=value.split(",")[0];
			String locvalue=value.split(",")[1];
			
			switch(loctype)
			{
			
			case "id":
				loc=By.id(locvalue);
				break;
			case "name":
				loc=By.name(locvalue);
				break;
			case "classname":
				loc=By.className(locvalue);
				break;
			case "tagname":
				loc=By.tagName(locvalue);
				break;
			case "linktext":
				loc=By.linkText(locvalue);
				break;
			case "partiallinktext":
				loc=By.partialLinkText(locvalue);
				break;
			case "xpath":
				loc=By.xpath(locvalue);
				break;
			case "cssselector":
				loc=By.cssSelector(locvalue);
				break;
			}
			return loc;
		}
	}



	



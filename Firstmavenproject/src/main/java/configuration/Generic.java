package configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Generic 
{
	public static Select dropdownhandle(WebDriver driver,By prop)
	{
		Select s=new Select(driver.findElement(prop));
		
		return s;
	}

}

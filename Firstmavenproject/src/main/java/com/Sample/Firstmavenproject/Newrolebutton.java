package com.Sample.Firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Newrolebutton extends Base
{
	public static WebElement newrole(WebDriver driver)
	{
		return driver.findElement(getelement("newrole_btn"));
	}

}

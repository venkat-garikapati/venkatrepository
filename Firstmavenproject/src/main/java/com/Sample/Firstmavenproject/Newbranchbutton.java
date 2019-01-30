package com.Sample.Firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Newbranchbutton extends Base
{
	public static WebElement newbranch(WebDriver driver)
	{
		return driver.findElement(getelement("newbranch_btn"));
	}
	

}

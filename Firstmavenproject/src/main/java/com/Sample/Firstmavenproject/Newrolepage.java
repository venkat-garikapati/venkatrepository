package com.Sample.Firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.Base;

public class Newrolepage extends Base
{
	public static WebElement rolename(WebDriver driver)
	{
		return driver.findElement(getelement("rolename_field"));
	}
	
	public static WebElement roledesc(WebDriver driver)
	{
		return driver.findElement(getelement("roledesc_field"));
	}
	
	public static Select roletype(WebDriver driver)
	{
		return new Select(driver.findElement(getelement("roletype_field")));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(getelement("submitbtn"));
	}

}

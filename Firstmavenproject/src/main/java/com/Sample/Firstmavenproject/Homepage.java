package com.Sample.Firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import testbase.Base;

public class Homepage extends Base
{
	public static WebElement username(WebDriver driver)
	{
		return driver.findElement(getelement("username_field"));
	}
	
	public static WebElement password(WebDriver driver)
	{
		return driver.findElement(getelement("password_field"));
		
	}
	
	public static WebElement login(WebDriver driver)
	{
		return driver.findElement(getelement("login_button"));
		
	}

}

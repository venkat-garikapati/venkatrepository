package com.Sample.Firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import testbase.Base;

public class Newbranchpage extends Base
{

	public static WebElement branchname(WebDriver driver)
	{
		 return driver.findElement(getelement("branchname_field"));
	}
	
	public static WebElement adress1(WebDriver driver)
	{
		return driver.findElement(getelement("adress1_field"));
	}
	
	public static WebElement adress2(WebDriver driver)
	{
		return driver.findElement(getelement("adress2_field"));
	}
	
	public static WebElement adress3(WebDriver driver)
	{
		return driver.findElement(getelement("adress3_field"));
	}
	
	public static WebElement area(WebDriver driver)
	{
		return driver.findElement(getelement("area_field"));
	}
	
	public static WebElement zipcode(WebDriver driver)
	{
		return driver.findElement(getelement("zipcode_field"));
	}
	
	public static Select country(WebDriver driver)
	{
		return new Select(driver.findElement(getelement("country_field")));
	}
	
	public static Select state(WebDriver driver)
	{
		return new Select(driver.findElement(getelement("state_field")));
	}
	
	public static Select city(WebDriver driver)
	{
		return new Select(driver.findElement(getelement("city_field")));
	}
	
	public static WebElement submit(WebDriver driver)
	{
		return driver.findElement(getelement("submitbtn"));
		
	}
	
	
	
	
	
	

}

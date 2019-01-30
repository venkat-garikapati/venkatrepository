package com.Sample.Firstmavenproject;

import testbase.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Adminpage extends Base
{
	
        public static WebElement branches(WebDriver driver)
		{
			return driver.findElement(getelement("branches_link"));
		
		}
		
		public static WebElement roles(WebDriver driver)
		{
			return driver.findElement(getelement("roles_link"));
		}
		
		public static WebElement users(WebDriver driver)
		{
			return driver.findElement(getelement("users_link"));
		}
		
		public static WebElement emp(WebDriver driver)
		{
			return driver.findElement(getelement("employee_link"));
		}
	}
		
		
		
		
		






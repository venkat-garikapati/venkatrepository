package com.Sample.Firstmavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import configuration.Generic;
import testbase.Base;

public class Repository extends Base
{
	WebDriver driver;
	public void login()
	{
		Homepage.username(driver).sendKeys(getconfig("username"));
		Homepage.password(driver).sendKeys(getconfig("password"));
		Homepage.login(driver).click();
		
	}
	public void launch()
	{
		System.setProperty(getconfig("chromedrivername"), getconfig("chromedriverpath"));
		driver=new ChromeDriver();
		driver.get(getconfig("build1"));
	}
	public void branchclick()
	{
		Adminpage.branches(driver).click();
		
	}
	
	public void branchcreation()
	{
		Newbranchbutton.newbranch(driver).click();
		Newbranchpage.branchname(driver).sendKeys("ATHOTA");
		Newbranchpage.adress1(driver).sendKeys("Staion road");
		Newbranchpage.adress2(driver).sendKeys("xxxxxxxxx");
		Newbranchpage.adress3(driver).sendKeys("xxxxxxxx");
		Newbranchpage.area(driver).sendKeys("Athota");
		Newbranchpage.zipcode(driver).sendKeys("522306");
		Generic.dropdownhandle(driver, getelement("country_field")).selectByVisibleText("INDIA");
		Generic.dropdownhandle(driver, getelement("state_field")).selectByVisibleText("Andhra Pradesh");
		Generic.dropdownhandle(driver, getelement("city_field")).selectByVisibleText("TENALI");
		Newbranchpage.submit(driver).click();
	}
	
	public void roleclick()
	{
		Adminpage.roles(driver).click();
		Newrolebutton.newrole(driver).click();
	}
	public void rolecreation()
	{
		Newrolepage.rolename(driver).sendKeys("Managervenkat");
		Newrolepage.roledesc(driver).sendKeys("venkatvenky");
		Newrolepage.roletype(driver).selectByVisibleText("E");
		Newrolepage.submit(driver).click();
	}
	
	
	
	
	
	
	
	
	
	

}

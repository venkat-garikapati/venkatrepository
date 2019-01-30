package com.Sample.Firstmavenproject;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testexcution extends Repository
{
	@BeforeTest
	public void verify_launch()
	{
		launch();
	}
	@Test(priority=0)
	public void verify_login()
	{
		login();
		
	}
	@Test(enabled=false)
	public void verify_branchclick()
	{
		branchclick();
		
	}
	@Test(enabled=false)
	public void verify_branchcreation()
	{
		branchcreation();
	}
	@Test(priority=1)
	public void verify_roleclick()
	{
		roleclick();
		
	}
	@Test(priority=2)
	public void verify_rolecreation()
	{
		rolecreation();
	}

}

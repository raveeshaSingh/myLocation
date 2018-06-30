package com.vtiger.pages;

import org.openqa.selenium.WebDriver;

public class HomePage extends HeaderPage {
	WebDriver driver;
	

	public HomePage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
	}
	
	public void verifyHomePage()
	{
		System.out.println("Verified Home page successfully");
	}
	
	

}

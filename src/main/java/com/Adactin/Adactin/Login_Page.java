package com.Adactin.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	//driver
	private WebDriver driver;
	
	
	//webelement element = driver.findby(By.xpath("//tagname[@attributname ='attributevalue']")

    //findby(By.xpath)

	@FindBy (id = "username")

	   //WebElement

   private WebElement Username;
	
	@FindBy (name = "password")
	 
	private WebElement Password;
	
	@FindBy (id = "login")
			
    private WebElement Login;
    
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLogin() {
		return Login;
	}

	public Login_Page (WebDriver driver)
	{
		{
			this.driver = driver;
			
			PageFactory.initElements (driver,this);

		}

	}

}

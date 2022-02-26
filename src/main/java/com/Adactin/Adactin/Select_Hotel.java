package com.Adactin.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	private WebDriver driver;
	
	@FindBy (id="radiobutton_0")
	private WebElement radiobtn;
	
   @FindBy (name="continue")
	private WebElement Continue;
	
	@FindBy (name="cancel")
	private WebElement Cancel;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getContinue() {
		return Continue;
	}

	public WebElement getCancel() {
		return Cancel;
	}
	
	public Select_Hotel (WebDriver driver)
	{
		{
			this.driver = driver;
			
			PageFactory.initElements (driver,this);

		}
	
	
	}
}


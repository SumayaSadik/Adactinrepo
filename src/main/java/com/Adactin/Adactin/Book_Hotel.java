package com.Adactin.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	private WebDriver driver;
	
	@FindBy (name="first_name")
	private WebElement firstname;
	
	@FindBy (name="last_name")
	private WebElement lastname;
	
	@FindBy (id="address")
	private WebElement address;

   @FindBy (id="cc_num")
	private WebElement CCnumber;
	
	@FindBy (name="cc_type")
	private WebElement CCtype;
	
	@FindBy (name="cc_exp_month")
	private WebElement CCexpmnth;
	
	@FindBy (name="cc_exp_year")
	private WebElement CCYExpyear;
	
	@FindBy (name="cc_cvv")
	private WebElement cvv;
	
	@FindBy (name="book_now")
	private WebElement Booknow;
	
	@FindBy (name="cancel")
    private WebElement cancel;    
	
	public WebElement getCCexpmnth() {
		return CCexpmnth;
	}

	public WebElement getCCYExpyear() {
		return CCYExpyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return Booknow;
	}

	public WebElement getCancel() {
		return cancel;
	}

	public WebElement getCCnumber() {
		return CCnumber;
	}

	public WebElement getCCtype() {
		return CCtype;
	}
	
	public WebElement getAddress() {
		return address;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getFirstname() {
		return firstname;
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public Book_Hotel (WebDriver driver)
	
	{
		{
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
	}
	
	
}

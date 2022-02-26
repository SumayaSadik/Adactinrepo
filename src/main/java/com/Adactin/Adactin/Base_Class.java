package com.Adactin.Adactin;


	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;
	import java.io.IOException;
	import java.util.NoSuchElementException;
	import java.util.concurrent.TimeUnit;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.safari.SafariDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.FluentWait;
	import org.openqa.selenium.support.ui.Select;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;

	    public class Base_Class {
		
		public static WebDriver driver;
		
		//launch Browser
		
		public static WebDriver browserlaunch (String browsername) {
		 
		 
		 if (browsername.equalsIgnoreCase("chrome"))
		 {
		 
		 
		 {
			 System.setProperty("webdriver.chrome.driver", "/Users/admin/eclipse-workspace/Adactin/Driver/chromedriver");
			 
			 driver = new ChromeDriver();
		 }
		 }
		 
		 else if (browsername.equalsIgnoreCase("Safari"))
		 {
			 driver = new SafariDriver();
		 }
		 
		 else
		 {
			 
	         System.setProperty("webdriver.gecko.driver", "/Users/admin/eclipse-workspace/Adactin/Driver/geckodriver");
			 
	         driver = new FirefoxDriver();
		 }
		 
		 return driver;
		 }
		 
		 //launch url
		 
		 public static void launchUrl (String Url)
		 {
			 driver.get(Url);
		 }
		 
		 //close
		 
		 public static void Close()
		 {
			 driver.close();
		 }
		 
		 //quit
		 
		 public static void Quit()
		 {
			 driver.quit();
		 }
		 
		 //sendkeys
		 
		 public static void sendkeys(WebElement element, String value)
		 {
			 element.sendKeys(value);
		 }
		 
		 //Navigate to
		 
		 public static void navigateto(String Url)
		 
		 {
			 driver.navigate().to(Url);
		 }
		 
		 //Navigate back
		 
		 public static void navigateback()
		 {
			 driver.navigate().back();
			 
		 }
		 
		 //Navigate Forward
		 
		 public static void navigateforward()
		 {
			 driver.navigate().forward();
		 }
		 
		 //Navigate refresh
		 
		 public static void navigaterefresh()
		 {
			 driver.navigate().refresh();
		 }
		 
		 //SimpleAlert
		 
		 public static void alert()
		 {
			 driver.switchTo().alert();
			 
		 }
		 
		 //confirm alert
		 
		 public static void ConfirmAlert(String value)
		 {
			 Alert ConfirmAlert = driver.switchTo().alert();

		 
		 if (value.equals("accept"))
		 {
			 ConfirmAlert.accept(); 
		 }
		 
		 else
		 {
			 ConfirmAlert.dismiss();
		 }
	}
		 
		 //promptAlert
		 public static void PromptAlert(WebElement element, String value)
		 {
			 Alert PromptAlert = driver.switchTo().alert();
		 if (value.equals("accept"))
			 {
				 PromptAlert.accept();
				 element.sendKeys(value);
			 }
			 
			 else
			 {
				 PromptAlert.dismiss();
			 }}
		 
		 //Actions
		 public static void click(WebElement element)
		 
		 {
			 Actions ac = new Actions(driver);
			 ac.click(element).build().perform();
	     }
		 
	     public static void contextclick(WebElement element)
		 
		 {
			 Actions ac = new Actions(driver);
			 ac.contextClick(element).build().perform();
	     }

	     public static void doubleclick(WebElement element)

	     {
		 Actions ac = new Actions(driver);
		 ac.doubleClick(element).build().perform();
	     }

	     public void moveToElement(WebElement element)

	     {
		 Actions ac = new Actions(driver);
		 ac.moveToElement(element).build().perform();
	     }
	     
	    //dropdown 
	     
	     public static void selectbyValue (WebElement element, String value)
	     {
	    	 Select s = new Select (element);
	    			 s.selectByValue(value);
	     }
	     
	     
	     public static void selectBytext (WebElement element, String value)
	     {
	    	 Select s = new Select (element);
	    			 s.selectByVisibleText(value);
	    			
	     }
	 
	     public static void selectIndex (WebElement element, int value)
	     {
	    	 Select s = new Select (element);
	    			 s.selectByIndex(value);
	     }
	     
	     //checkbox
	     
	     public static void checkbox(WebElement element)
	     {
	    	 element.click();
	     }
	     
	     //Isdisplayed
	     
	     public static void isDisplayed(WebElement element)
	     
	     {
	      element.isDisplayed();	 
	 
	     }

	     //isEnabled
	     
	     public static void isEnabled(WebElement element)
	     {
	    	 element.isEnabled();
	     }
	     
	     
	     //isSelected
	     
	     public static void isSelected (WebElement element)
	     
	     {
	    	//boolean selected = element.isSelected(); 
	    	//System.out.println(selected);
	    	 
	    	 element.isSelected(); 
	     }
	     
	     
	     //frames
	     
	     public static void frameMethod (String str)
	     
	     {
	    	 driver.switchTo().frame(str);
	     }
	     
	     public static void defaultcontent ()
	     {
	    	 driver.switchTo().defaultContent();
	     }
	     
	     //get options
	     
	     public static  void getoptions (WebElement element)
	     
	     {
	     Select selectlist = new Select (element);
	     selectlist.getOptions();
	     }
	     
	     //getfirstselectedoptions
	     
	     public static void getFirstselected (WebElement element )
	     {
	    	Select s= new Select(element);
	    	s.getFirstSelectedOption();
	     }
	     
	     //getAllselectedoptions
	     
	     public static void getAllselected (WebElement element)
	     {
	         Select Allselect = new Select (element);
	         Allselect.getAllSelectedOptions();

	     }
	     
	     //gettitle
	     public static String gettitle ()
	     {
	    	String title = driver.getTitle();
	    	return title;
	     }
	     
	     //getcurrenturl
	     
	     public static void getCurrenturl()
	     {
	    	 String currentUrl = driver.getCurrentUrl();
	    	 System.out.println(currentUrl);
	     }
	     
	     //getAttribute
	     
	     public static void getAttribute(WebElement element, String value)
	     {
	    	 String attribute = element.getAttribute(value);
	    	 System.out.println(attribute);
	    	 
	     }
	    	 
	    //getText
	     
	     public static void getText (WebElement element, String value)
	     { 
	    	 String text = element.getText();
	    	 System.out.println(text);
	     }
	     
	     
	     //wait
	     
	     public static void Implicitwait(int value)
	     
	     {
	    	 driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	     
	     }
	    	 
	    	 
	    public static void Explicitwait (WebDriver driver,WebElement element, int value)
	    {
	    	
	    	WebDriverWait wait = new WebDriverWait(driver,value);
			wait.until(ExpectedConditions.visibilityOf(element));
	    	
	   }
	    
	    
	    //fluent wait
	    public static void FluentWait(int value)
	    {
	    	@SuppressWarnings("depraction")
	    	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(value, TimeUnit.SECONDS).pollingEvery(value,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	    	
	    }
	    
	   //screenshot
	    
	    public static void screenshot(WebDriver driver) throws IOException
	    {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			File destination = new File ("/Users/pyt/eclipse-workspace/Adactin/Screenshots");
			FileUtils.copyFile (source,destination);
	}
	    
	    //robot class
	    
	    public void robot () throws AWTException
	    
	    {
			Robot r = new Robot();

			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);


	    }
	    
	    //WindowHandles
	    
	    public static void windowhandles()
	    
	    {
	    	driver.getWindowHandles();
	    }
	    
	    
	    //scrollfunction
	    
	    public static void scrollup (int value, int value1)
	    {
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(value,value1);");

	    }
	    
	    
	    public static void scrolldown (int value, int value1)
	    {
	    	
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollTo(value,document.body.scrollHeight)");

	    }
	    
	    
	   
	    
	    //ismultiple
	    
	    public static void isMultiple(WebElement element)
	    {
	    	Select s = new Select (element);
	    	s.isMultiple();
	    }
	    
	    //radio
	    
	    public static void radiobtn(WebElement element)
	    
	    {
	    	element.click();
	    
	    }
	    
	    
	}


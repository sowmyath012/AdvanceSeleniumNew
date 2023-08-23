package generic_Utility;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriver_Utility {
	
	/**
	 * This method is used for maximizing the screen
	 * @param driver
	 */
	public void maximizeScreen(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	
	/**
	 * This method is used for minimizing the screen
	 * @param driver
	 */
	public void minimizeScreen(WebDriver driver)
	{
		//driver.manage().window().minimize();
	}
	
	
	/**
	 *  This method will wait for page to load for 10 seconds
	 * @param driver
	 */
	
    public void implicitwait(WebDriver driver)
    {
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    
    /**
	 * 	This method will wait for 20 seconds for a element to be visible
	 * @param driver
	 * @param element
	 */
	//public void waitForElementToBeVisisble(WebDriver driver, WebElement element)
	//{
	//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	//	wait.until(ExpectedConditions.visibilityOf(element));
	//}
    
    /**
	 * This method will handle drop down by index
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element, int index)
	{
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	/**
	 * This method will handle drop down by value
	 * @param element
	 * @param index
	 */
	public void handleDropDown(WebElement element, String value)
	{
		Select sel = new Select(element);
		sel.selectByValue(value);
	}
	
	/**
	 * This method will handle drop down by value
	 * @param element
	 * @param index
	 */
	public void handleDropDown(String visibleText,WebElement element)
	{
		Select sel = new Select(element);
		sel.selectByVisibleText(visibleText);
	}
	
	/**
	 * This method will perform mouse hover action
	 * @param driver
	 * @param element
	 */
	public void mouseHoverAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	/**
	 * This method will right click anywhere on web page
	 * @param driver
	 */
	public void rightClickAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
	/**
	 * This method will right click on particular web element
	 * @param driver
	 */
	public void rightClickAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.contextClick(element).perform();
	}
	
	/**
	 * This method will double click anywhere on web page
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver)
	{
		Actions act = new Actions(driver);
		act.doubleClick().perform();
	}
	
	/**
	 * This method will double click on a web element
	 * @param driver
	 */
	public void doubleClickAction(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	/**
	 * This method will drag and drop from src element to target element
	 * @param driver
	 * @param srcElement
	 * @param targetElement
	 */
	public void dragAndDropAction(WebDriver driver, WebElement srcElement, WebElement targetElement)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(srcElement, targetElement).perform();
	}
    
	/**
	 * This method will drag and drop from src element to target element offsets
	 * @param driver
	 * @param srcElement
	 * @param targetElement
	 */
	public void dragAndDropAction(WebDriver driver,WebElement src, int x, int y)
	{
		Actions act = new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
	}
	
	/**
	 * This method will handle frame By Index
	 * @param driver
	 * @param index
	 */
	public void switchToFrame(WebDriver driver, int index)
	{
		driver.switchTo().frame(index);
	}
	

	/**
	 * This method will handle frame By name or ID
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver, String nameOrId)
	{
		driver.switchTo().frame(nameOrId);
	}
	
	/**
	 * This method will handle frame By web element
	 * @param driver
	 * @param nameOrId
	 */
	public void switchToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	
	/**
	 * This method will switch the control from child frame to immediate parent
	 * @param driver
	 */
	public void switchToParentFrame(WebDriver driver)
	{
		driver.switchTo().parentFrame();
	}
	
	/**
	 * This method will switch the control from child frame to default Frame
	 * @param driver
	 */
	public void switchToDefaultFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	}
	
	/**
	 * This method will accept the alert pop-up
	 * @param driver
	 */
	public void acceptAlert1(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	
	/**
	 * This method will dismiss the alert pop-up
	 * @param driver
	 */
	public void dismissAlert(WebDriver driver)
	{
		driver.switchTo().alert().dismiss();
	}
	
	/**
	 * This method will capture the alert text and return it to user
	 * @param driver
	 * @return
	 */
	public String getAlertText(WebDriver driver)
	{
		return driver.switchTo().alert().getText();
	}
	

	/**
	 * This method will take screen shot and return the absolute path
	 * @param driver
	 * @param screenShotName
	 * @return
	 * @throws IOException
	 */
	/*public String takeScreenShot(WebDriver driver, String screenShotName) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst = new File(".\\ScreenShots\\"+screenShotName+".png");
		                                     //screenShot1.png
		Files.copy(src, dst);
		
		return dst.getAbsolutePath(); // -- Used for Extent reports 
		
	}*/
	
	/**
	 * This method will scroll down randomly for 500 units
	 * @param driver
	 */
	public void scrollAction(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("windows.scrollBy(0,500);", null);
		
	}
	
	/**
	 * This method will switch the windows based on window title
	 * @param driver
	 * @param partialWindowTitle
	 */
	public void switchToWindow(WebDriver driver, String partialWindowTitle)
	{
		//Step 1: Capture all the window IDs
		Set<String> winIDs = driver.getWindowHandles();
		
		//Step 2: Navigate to each window
		for(String winID:winIDs)
		{
			//Step 3: capture the title of title of each window
			String actTitle = driver.switchTo().window(winID).getTitle();
			
			//Step 4: compare the title
			if(actTitle.contains(partialWindowTitle))
			{
				break;
			}
			
		}
		
	
	}
	
    /**
     * This method is used for switching one window to another window
     * @param driver
     * @param partialText
     */
    public void switchWindow(WebDriver driver,String partialText) 
    {
    Set<String> allWindows1 = driver.getWindowHandles();
    Iterator<String> id1 = allWindows1.iterator();
    while(id1.hasNext())
    {
  	  String win1 = id1.next();
  	  driver.switchTo().window(win1);
  	  String title = driver.getTitle();
  	  if(title.contains(partialText))
  	  {
  		  break;
  	  }
    }
    
}

  /**
   * This method is used to scroll down
   * @param driver
   * @param x
   * @param y
   */
   public void scrollDown(WebDriver driver, int x, int y)
    {
   	JavascriptExecutor	js = (JavascriptExecutor) driver;
   		 for(int i=0;i<4;i++) {
   			 js.executeScript("window.scrollBy(x, y)");
   		 }

    }
   
   /**
    * This method is used to move to element
    * @param driver
    * @param ele
    */
   public void actionsMoveToElement(WebDriver driver,WebElement ele ) {
	Actions act=new Actions(driver);
	act.moveToElement(ele).perform();	  
   }
   
   
   /**
    * This method is used to scroll down
    * @param driver
    * @param element
    */
   public void javaScriptExecutor(WebDriver driver,WebElement element) {
	   JavascriptExecutor js =(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView()",  element);
		
   }
   public void acceptAlert(WebDriver driver) {
	   Alert alt = driver.switchTo().alert();
		 alt.accept();
   }
   
   public void acceptDimiss(WebDriver driver) {
	   Alert alt = driver.switchTo().alert();
		 alt.dismiss();
   }
}

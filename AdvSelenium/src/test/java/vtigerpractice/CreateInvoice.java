package vtigerpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateInvoice {

	public static void main(String[] args) throws AWTException, Throwable {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin",Keys.TAB, "admin",Keys.ENTER);
		driver.findElement(By.xpath("//img[@src='themes/softed/images/menuDnArrow.gif']")).click();
		driver.findElement(By.name("Invoice")).click();
		driver.findElement(By.xpath("//img[@alt='Create Invoice...']")).click();
		driver.findElement(By.name("subject")).sendKeys("Laptop");
		driver.findElement(By.id("customerno")).sendKeys("08907");
		driver.findElement(By.xpath("//input[@name='account_name']/following-sibling::img")).click();
		
		
		Set<String> allWindows = driver.getWindowHandles();
	      Iterator<String> id = allWindows.iterator();
	      while(id.hasNext())
	      {
	    	  String win = id.next();
	    	  driver.switchTo().window(win);
	    	  String title = driver.getTitle();
	    	  if(title.contains("Accounts&action"))
	    	  {
	    		  break;
	    	  }
	      }
	      
		driver.findElement(By.linkText("Infotech")).click();
		 Alert alt = driver.switchTo().alert();
	       alt.accept();
		
	   	Set<String> allWindows1 = driver.getWindowHandles();
	      Iterator<String> id1 = allWindows.iterator();
	      while(id.hasNext())
	      {
	    	  String win = id.next();
	    	  driver.switchTo().window(win);
	    	  String title = driver.getTitle();
	    	  if(title.contains("Invoice&action"))
	    	  {
	    		  break;
	    	  }
	      }
	       
		/*Set<String> collect2 = driver.getWindowHandles();
			for( String value:collect2) {
				driver.switchTo().window(value);
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("Invoice&action")){
					break;
				}
			}*/
		/* Robot r=new Robot();
		  r.keyPress(KeyEvent.VK_PAGE_DOWN);
		  r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		  Thread.sleep(1000);*/
    driver.findElement(By.name("ship_street")).sendKeys("ava, rj ,a.p");
   /* r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(1000);
    r.keyPress(KeyEvent.VK_PAGE_DOWN);
    r.keyRelease(KeyEvent.VK_PAGE_DOWN);
    Thread.sleep(1000);
     driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();*/
	}

}

package practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws IOException {
	
		
		//WEBDRIVER MANAGER
		
		/*WebDriver driver;
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();*/
		
		/*WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();*/
		
		/*WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();*/
		WebDriver driver=new ChromeDriver();
		FileInputStream fis=new FileInputStream("login.txt");
	    Properties pro=new Properties();
	    pro.load(fis);
	    String link = pro.getProperty("url");
	    String name = pro.getProperty("username");
	    String pd = pro.getProperty("password");
	    String searchitem = pro.getProperty("search");
	    driver.get(link);
	    driver.findElement(By.xpath("//span[.='Hello, sign in']")).click();
	    driver.findElement(By.xpath("//input[@name='email']")).sendKeys(name);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	    driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pd);
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    
	    
	    
	   
	
		
		

	}

}

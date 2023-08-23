package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InsertDataIntoPropertyFile {

	public static void main(String[] args) throws Throwable {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		Properties pro=new Properties();
		pro.setProperty("username", "admin");
		pro.setProperty("password", "manager");
		pro.setProperty("url", "https://demo.actitime.com/login.do");
	FileOutputStream fos=new FileOutputStream("./src/test/resources/note1.properties");
	pro.store(fos, "data");
	System.out.println("data written successfully");
		
	FileInputStream fis=new FileInputStream("./src/test/resources/note1.properties");
	Properties pro1=new Properties();
	pro1.load(fis);
	String link = pro1.getProperty("url");
	String name = pro1.getProperty("username");
	String pwd = pro1.getProperty("password");
	driver.get(link);
	driver.findElement(By.id("username")).sendKeys(name);
	driver.findElement(By.name("pwd")).sendKeys(pwd);
	driver.findElement(By.xpath("//div[text()='Login ']")).click();

		
	}

}

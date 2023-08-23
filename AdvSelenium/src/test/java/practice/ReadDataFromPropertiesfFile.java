package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPropertiesfFile {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		FileInputStream fis=new FileInputStream("./src/test/resources/note1.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String link = pro.getProperty("url");
		String name = pro.getProperty("username");
		String pwd = pro.getProperty("password");
		driver.get(link);
		driver.findElement(By.id("username")).sendKeys(name);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
	

	}

}

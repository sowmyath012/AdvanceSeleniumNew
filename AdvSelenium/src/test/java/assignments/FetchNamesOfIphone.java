package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FetchNamesOfIphone {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[.='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		List<WebElement> names = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        for(int i=0;i<names.size();i++) {
        	System.out.println(names.get(i).getText());
        }

	
	}
}
